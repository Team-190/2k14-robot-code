//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class  WaitForPressure extends Command {
    public WaitForPressure() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return Robot.pneumatics.isPressurized();
    }
    protected void end() {
    }
    protected void interrupted() {
        end();
    }
}
