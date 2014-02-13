//This command lowers the pivot until the button is released or the lower
//limitswitch is released
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class  PivotLower extends Command {
    
        double motorSpeed = 0.5;
    
    public PivotLower() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.pivot);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.pivot.disable();
    }
    protected void execute() {
        Robot.pivot.setMotor(-motorSpeed);
    }
    protected boolean isFinished() {
        return Robot.pivot.lowerLimitSwitchPressed();
    }
    protected void end() {
        Robot.pivot.setMotor(0);
    }
    protected void interrupted() {
        end();
    }
}
