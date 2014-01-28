//needs work

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.AutoDirection;
import org.usfirst.frc190.CurrentRobotProject.Robot;
/**
 *
 */

//This command makes the robot spin a set number of degrees at a specific speed.

public class  DriveSpin extends Command {
    
    private double turnSpeed = 0.5;
    private double spinAngle = 180;
    
    public DriveSpin(double angle, double speed){
        turnSpeed = speed;
        spinAngle = angle;
        requires(Robot.drivetrain);
    }
    
    public DriveSpin() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.drivetrain.resetDriveEncoders();
        if((Robot.getAutonomousDirection() != AutoDirection.NO_MOVEMENT) && (Robot.getAutonomousDirection() != AutoDirection.FORWARD)){
            //Is auto is set to Left or Right.
            Robot.drivetrain.resetGyro();
            if(spinAngle < 0){
                //Turn left.
                Robot.drivetrain.tankDriveWithValues(-turnSpeed, turnSpeed);
            }else{
                //Turn right.
                Robot.drivetrain.tankDriveWithValues(turnSpeed, -turnSpeed);
            }
        }
    }
    
    protected void execute() {
    }
    protected boolean isFinished() {
        if((Robot.getAutonomousDirection() != AutoDirection.NO_MOVEMENT) && (Robot.getAutonomousDirection() != AutoDirection.FORWARD)){
            if(spinAngle < 0){
                //Turn left.
                return (spinAngle >= Robot.drivetrain.getGyro());
            }else{
                //Turn right.
                return (spinAngle <= Robot.drivetrain.getGyro());
            }
        }else{
            return true;
        }
    }
    
    protected void end() {
        Robot.drivetrain.tankDriveWithValues(0, 0);
    }
    protected void interrupted() {
        end();
    }
}
