//We need to modify this to work in auto - discuss

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.AutoDirection;

public class DriveForward extends Command {

    private double driveForwardSpeed = .5;
    private double distance;
<<<<<<< HEAD
    private boolean alwaysRun;
    
=======

>>>>>>> 1602907022cfcf5b51ea147960f4dd73a010f7f0
    public DriveForward() {
        distance = 0;
        requires(Robot.drivetrain);
        alwaysRun = false;
    }
    
    public DriveForward(double driveDistance, double speed, boolean alwaysGo) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        distance = driveDistance;
        driveForwardSpeed = speed;
        alwaysRun = alwaysGo;
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    public DriveForward(double driveDistance, double speed) {
        distance = driveDistance;
        driveForwardSpeed = speed;
<<<<<<< HEAD
        alwaysRun = false;
	
=======

>>>>>>> 1602907022cfcf5b51ea147960f4dd73a010f7f0
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
<<<<<<< HEAD
        Robot.drivetrain.resetDriveEncoders();
        if(Robot.getAutonomousDirection() != AutoDirection.NO_MOVEMENT){
=======
        if (Robot.getAutonomousDirection() != AutoDirection.NO_MOVEMENT) {
>>>>>>> 1602907022cfcf5b51ea147960f4dd73a010f7f0
            //Is nessecary.
            if (distance < 0) {
                //Go backward.
<<<<<<< HEAD
                Robot.drivetrain.tankDriveWithValues(-driveForwardSpeed, -driveForwardSpeed);
            }else{
=======
                Robot.drivetrain.tankDrive(-driveForwardSpeed, -driveForwardSpeed);
            } else {
>>>>>>> 1602907022cfcf5b51ea147960f4dd73a010f7f0
                //Go forward.
                Robot.drivetrain.tankDriveWithValues(driveForwardSpeed, driveForwardSpeed);
            }
        }
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        if (Robot.getAutonomousDirection() != AutoDirection.NO_MOVEMENT) {
            if (distance < 0) {
                //Going backward.
                return (Robot.drivetrain.getLeftEncoderDistance() <= distance) && (Robot.drivetrain.getRightEncoderDistance() <= distance);
            } else {
                return (Robot.drivetrain.getLeftEncoderDistance() >= distance) && (Robot.drivetrain.getRightEncoderDistance() >= distance);
            }
        } else {
            return true;
        }
    }

    protected void end() {
        Robot.drivetrain.stopDriveMotors();
    }

    protected void interrupted() {
        end();
    }
}
