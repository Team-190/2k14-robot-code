//This command set the setpoint for the stored position
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class PivotStoredPosition extends Command {
    
    private double degrees = 80;
    private boolean isInialized = false;
    
    public PivotStoredPosition() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.pivot);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.collector.setRollerSpeed(0);
        
        if(Robot.pivot.lowerLimitSwitchPressed()){
            Robot.pivot.setMotor(.75);
            Command wait = new WaitCommand(0.1);
            wait.start();
            Robot.pivot.setMotor(0);
        }if(Robot.pivot.topLimitSwitchPressed()){
            Robot.pivot.setMotor(-.75);
            Command wait = new WaitCommand(0.1);
            wait.start();
            Robot.pivot.setMotor(0);
        }isInialized = true;
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
        Robot.pivot.enable();
        Robot.pivot.setSetpoint(1.0);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
        Robot.pivot.setSetpoint(Robot.pivot.degreesToPotValue(degrees));
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return isInialized && (Robot.pivot.onTarget() || Robot.pivot.lowerLimitSwitchPressed() || Robot.pivot.topLimitSwitchPressed());
    }
    protected void end() {
        if  (Robot.pivot.lowerLimitSwitchPressed() || Robot.pivot.topLimitSwitchPressed()) {
            Robot.pivot.disable();
        }
    }
    protected void interrupted() {
        Robot.pivot.disable();
    }
}
