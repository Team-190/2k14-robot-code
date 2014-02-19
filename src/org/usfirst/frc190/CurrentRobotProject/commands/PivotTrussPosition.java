//This command starts a setpoint command and puts the pivot at the truss angle
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class PivotTrussPosition extends Command {
    
    private double degrees = 59;
    
    public PivotTrussPosition() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.pivot);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.pivot.disable();
        while(Robot.pivot.lowerLimitSwitchPressed()){
            System.out.println("Lower Limit");
            Robot.pivot.setMotor(0.5);
        }while(Robot.pivot.topLimitSwitchPressed()){
            Robot.pivot.setMotor(-0.5);
        }
        Robot.pivot.setMotor(0);
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
        Robot.pivot.enable();
        Robot.pivot.setSetpoint(1.0);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
        //Robot.pivot.setSetpoint(Robot.pivot.degreesToPotValue2(degrees));
        Robot.pivot.setSetpoint(2.257);
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return (Robot.pivot.onTarget() || Robot.pivot.lowerLimitSwitchPressed() || Robot.pivot.topLimitSwitchPressed());
    }
    protected void end() {
        if (Robot.pivot.lowerLimitSwitchPressed() || Robot.pivot.topLimitSwitchPressed()) {
            Robot.pivot.disable();
        }
    }
    protected void interrupted() {
        Robot.pivot.disable();
    }
}
