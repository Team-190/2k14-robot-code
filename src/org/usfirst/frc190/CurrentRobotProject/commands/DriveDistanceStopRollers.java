//

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class  DriveDistanceStopRollers extends Command {
    
    private double distance;
    private double maxSpeed;
    private double speed;
    private double error = 0;
    private double Kp = -1;
    private double tolerance = 1;

    
    public DriveDistanceStopRollers() {
        this(25.0, 0.5);
    }
    
    public DriveDistanceStopRollers(double dist, double givenSpeed) {
        requires(Robot.drivetrain);
        distance = dist;
        maxSpeed = givenSpeed;
    }
    
    protected void initialize() {
        Robot.drivetrain.resetEncoderRight();
    }
    protected void execute() {
        error = distance - Robot.drivetrain.getEncoderDistanceRight();
        speed = error*Kp;
        
        if(speed > maxSpeed) {
            speed = maxSpeed;
        }
        if(speed < -maxSpeed) {
            speed = -maxSpeed;
        }
        
        Robot.drivetrain.tankDrive(speed, speed);
        
        if(Robot.collector.isCollected()){
            Robot.collector.stop();
        }
    }
    protected boolean isFinished() {
        return Math.abs(error) <= tolerance;
    }
    protected void end() {
        Robot.drivetrain.stopDriveMotors();
        Robot.collector.stop();
    }
    protected void interrupted() {
        end();
    }
}
