package org.usfirst.frc190.CurrentRobotProject.commands;
//This command doesn't perform any action,
//It simply waits until Piston 1 is extended


import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class WaitForExtended extends Command {

    public WaitForExtended() {

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.shooter.piston1IsExtended();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
