//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class  DriveBackward extends Command {
    
    
    private double driveForwardSpeed = .5;
    private double distance = 25; //approx inches * 2
    private final double tolerance = 5;
    private double error;
    private final double Kp = -1.0/5.0;
    public DriveBackward() {
        this(25.0,0.5);
    }
    public DriveBackward(double dist, double maxSpeed) {
        requires(Robot.drivetrain);
        distance = dist;
        driveForwardSpeed = maxSpeed;
    }
    protected void initialize() {
        Robot.drivetrain.resetEncoderRight();
        
        }
    protected void execute() {
        error = (distance - Robot.drivetrain.getEncoderDistanceRight());
        if(driveForwardSpeed*Kp*error >= driveForwardSpeed) {
            Robot.drivetrain.tankDrive(driveForwardSpeed, driveForwardSpeed);
        } else {
            Robot.drivetrain.tankDrive(driveForwardSpeed*Kp*error, driveForwardSpeed*Kp*error);
        }
    }
    protected boolean isFinished() {
        return (Math.abs(error) <= tolerance);
    }
    protected void end() {
        Robot.drivetrain.stopDriveMotors();
    }
    protected void interrupted() {
        end();
    }
}
