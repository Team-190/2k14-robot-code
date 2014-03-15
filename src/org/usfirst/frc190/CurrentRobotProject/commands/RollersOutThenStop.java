//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class  RollersOutThenStop extends Command {
    public RollersOutThenStop() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collector);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.collector.setRollerSpeed(-1);
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        Robot.collector.setRollerSpeed(0);
    }
    protected void interrupted() {
        end();
    }
}
