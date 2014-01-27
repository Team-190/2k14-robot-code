//This command needs work

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class ArmLower extends Command {

    private double speed = 0.5;

    public ArmLower() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.elevator);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
        Robot.elevator.setElevatorMotor(-speed);
    }

    protected void execute() {
    }

    protected boolean isFinished() {

        //Will be controlled/finished by a button on the OI.

        return false;
    }

    protected void end() {
        Robot.elevator.setElevatorMotor(0);
    }

    protected void interrupted() {
        end();
    }
}
