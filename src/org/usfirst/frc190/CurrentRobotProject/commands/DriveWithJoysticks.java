//This command allows the joysticks to drive the robot.
//It is always running except when interruted

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import edu.wpi.first.wpilibj.Joystick;

public class  DriveWithJoysticks extends Command {
    public DriveWithJoysticks() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
    }
    protected void execute() {
        Robot.drivetrain.tankDrive(Robot.oi.getLeftJoystick().getAxis(Joystick.AxisType.kY), 
                                   Robot.oi.getRightJoystick().getAxis(Joystick.AxisType.kY));
        
        //Turn on some sort of indicator on the robot. May or may not be needed.
        //Tucker - Is this necessary?
        Robot.drivetrain.setInPosistionIndicator(Robot.drivetrain.inPosition(0, 0)); 
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        Robot.drivetrain.tankDrive(0, 0);
    }
    protected void interrupted() {
        end();
    }
}
