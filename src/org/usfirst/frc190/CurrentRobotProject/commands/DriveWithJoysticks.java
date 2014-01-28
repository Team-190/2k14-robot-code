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
        if(Robot.drivetrain.shouldUseTankDrive()){
            Robot.drivetrain.tankDriveWithJoysitcks(Robot.oi.leftJoystick, Robot.oi.rightJoystick);
        }else{
            Robot.drivetrain.arcadeDriveWithJoysticks(Robot.oi.leftJoystick);
        }
 
        //Turn on some sort of indicator on the robot. May or may not be needed.
        Robot.drivetrain.setInPosistionIndicator(Robot.drivetrain.inPosition(5, 10));  
    }
    
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        Robot.drivetrain.stopDriveMotors();
    }
    protected void interrupted() {
        end();
    }    
}
