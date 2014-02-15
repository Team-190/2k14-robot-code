//This command drive the robot over a given distance with simple porportional
//control
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
//This command will drive a given distance at a given speed.
//Requires encoders.
//TODO: Fix with autotonomous implementation.
public class DriveForward extends Command {
    
    private double driveForwardSpeed = .75;
    private double distance = 7*12; //7 ft times 12 inches.
    private final double tolerance = 5;
    private double error;
    private final double Kp = -1.0/5.0;
    
    public DriveForward() {
        requires(Robot.drivetrain);
    }
    protected void initialize() {
        Robot.drivetrain.resetEncoder();
        
        }
    protected void execute() {
        error = (distance - Robot.drivetrain.getEncoderDistance());
        //Robot.drivetrain.tankDrive(0.2,0.2);
        Robot.drivetrain.tankDrive(driveForwardSpeed*Kp*error, driveForwardSpeed*Kp*error);
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
