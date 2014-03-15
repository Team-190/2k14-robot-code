//This command drive the robot over a given distance with simple porportional
//control
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
//This command will drive a given distance at a given speed.
//Requires encoders.
//TODO: Fix with autotonomous implementation.
public class DriveForwardTimeout extends Command {
    
    private double driveForwardSpeed = .5;
    private double distance = 10; //was 25 or 37 or 20
    private final double tolerance = 5;
    private double error;
    private final double Kp = -1.0/25.0;
    
    
    public DriveForwardTimeout() {
        requires(Robot.drivetrain);
        distance = 0;
    }
    public DriveForwardTimeout(double time, double dist) {
        requires(Robot.drivetrain);
        setTimeout(time);
        distance = dist;
    }
    public DriveForwardTimeout(double time, double dist, double maxSpeed){
        requires(Robot.drivetrain);
        setTimeout(time);
        distance = dist;
        driveForwardSpeed = maxSpeed;
    }
    protected void initialize() {
        Robot.drivetrain.resetEncoderRight();
        setTimeout(2);
        }
    protected void execute() {
        error = (distance - Robot.drivetrain.getEncoderDistanceRight());
        if(driveForwardSpeed*Kp*error >= driveForwardSpeed) {
            Robot.drivetrain.tankDrive(driveForwardSpeed, driveForwardSpeed);
        } else {
            Robot.drivetrain.tankDrive(driveForwardSpeed*Kp*error, driveForwardSpeed*Kp*error);
        }
        //Robot.drivetrain.tankDrive(0.2,0.2);
    }
    protected boolean isFinished() {
        return (Math.abs(error) <= tolerance)||isTimedOut();
    }
    protected void end() {
        Robot.drivetrain.stopDriveMotors();
    }
    protected void interrupted() {
        end();
    }
}
