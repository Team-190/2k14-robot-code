//This command pressurizes Piston 2, preparing it to fire a far shoot
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class PressurizePiston2 extends Command {
    public PressurizePiston2() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.shooter.pressurize2();
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}
