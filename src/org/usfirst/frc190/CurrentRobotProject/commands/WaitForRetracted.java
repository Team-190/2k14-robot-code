//This command doesn't perform any action,
//It simply waits until the Piston 1 is retracted
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class WaitForRetracted extends Command {
    public WaitForRetracted() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    public WaitForRetracted(double timeout) {
        setTimeout(timeout);
    }
    protected void initialize() {
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return Robot.shooter.piston1IsRetracted() || isTimedOut();
    }
    protected void end() {
    }
    protected void interrupted() {
        end();
    }
}
