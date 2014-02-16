//Pivot Subsystem: This subsystem contains the Van-door motor and the pot for
//PID setpoint control over the position.
package org.usfirst.frc190.CurrentRobotProject.subsystems;
import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class Pivot extends PIDSubsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput upperLimitSwitch = RobotMap.pivotUpperLimitSwitch;
    DigitalInput lowerLimitSwitch = RobotMap.pivotLowerLimitSwitch;
    AnalogChannel pot = RobotMap.pivotPot;
    SpeedController motor = RobotMap.pivotMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final double collectValue = 2.7;
    private final double storeValue = 2.123;
    private final double verticalValue = 2.061;
    private final double horizontalValue = 2.627;
    
    public Pivot() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("Pivot", 3.0, 0.05, 0.5);
        setAbsoluteTolerance(0.005);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("Pivot", "PIDSubsystem Controller", getPIDController());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        }
        
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
        return pot.getAverageVoltage();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        motor.pidWrite(output);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
    }
    
    public void setMotor(double speed){
        motor.set(-speed);
    }
    
    public boolean topLimitSwitchPressed(){
        return !upperLimitSwitch.get();
    }
    
    public boolean lowerLimitSwitchPressed(){
        return !lowerLimitSwitch.get();
    }
    
    public double degreesToPotValue(double degrees){
        return (((5*4*(90-degrees))/3600) + 1.804);
    }
    
    public double degreesToPotValue2(double degrees) {
        return ((horizontalValue - verticalValue)*((90-degrees)/90)+verticalValue);
    }
    
    public double getStoreValue() {
        return storeValue;
    }
    
    public double getCollectValue() {
        return collectValue;
    }
}
