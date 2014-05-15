//This command spins the robot over a given angle using simple porportional
//control.
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class  DriveSpin extends Command {
    
    private double turnSpeed = 1;
    private double spinAngle = 180;
    private final double tolerance = 10;
    private double error;
    private final double Kp = -1.0/90.0;
    
    public DriveSpin(){
        requires(Robot.drivetrain);
    }
    
    public DriveSpin(double angle){
        requires(Robot.drivetrain);
        spinAngle = angle;
    }
    
    protected void initialize() {
        Robot.drivetrain.resetGyro();
    }
    
    protected void execute() {
        error = (spinAngle - Robot.drivetrain.getGyro());
        Robot.drivetrain.tankDrive(turnSpeed*Kp*error, -turnSpeed*Kp*error);
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
