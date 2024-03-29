//This command sets the collector roller speeds to forward
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class RollersForward extends Command {
    public final double rollerForwardSpeed = 1;
    public RollersForward() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collector);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.collector.setRollerSpeed(rollerForwardSpeed);
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
    }
    protected void interrupted() {
        end();
    }
}
