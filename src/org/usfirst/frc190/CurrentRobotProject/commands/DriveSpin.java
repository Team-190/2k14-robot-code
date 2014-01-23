// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
/**
 *
 */
public class  DriveSpin extends Command {
    
    private double turnSpeed = 0.5;
    private double spinAngle = 180;
    
    public DriveSpin(double angle, double speed){
        turnSpeed = speed;
        spinAngle = angle;
        requires(Robot.drivetrain);
    }
    
    public DriveSpin() {
        
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.drivetrain.resetGyro();
        if(spinAngle < 0){
            //Turn left.
            Robot.drivetrain.tankDrive(-turnSpeed, turnSpeed);
        }else{
            //Turn right.
            Robot.drivetrain.tankDrive(turnSpeed, -turnSpeed);
        }
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(spinAngle < 0){
            //Turn left.
            return (spinAngle >= Robot.drivetrain.getGyro());
        }else{
            //Turn right.
            return (spinAngle <= Robot.drivetrain.getGyro());
        }
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.drivetrain.tankDrive(0, 0);
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
