package org.usfirst.frc190.CurrentRobotProject.subsystems;
import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
public class Drivetrain extends Subsystem {
        
    private static boolean useTankDrive = true;
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController cIM1 = RobotMap.drivetrainCIM1;
    SpeedController cIM2 = RobotMap.drivetrainCIM2;
    SpeedController cIM3 = RobotMap.drivetrainCIM3;
    SpeedController cIM4 = RobotMap.drivetrainCIM4;
    RobotDrive robotDrive4Motors = RobotMap.drivetrainRobotDrive4Motors;
    Encoder driveEncoder = RobotMap.drivetrainDriveEncoder;
    DigitalOutput inPositionIndicator = RobotMap.drivetrainInPositionIndicator;
    Gyro gyro = RobotMap.drivetrainGyro;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoysticks());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
    
    public void arcadeDriveWithJoysticks(Joystick leftAxis){
        robotDrive4Motors.arcadeDrive(leftAxis);
    }
    
    public void tankDriveWithJoysitcks(Joystick leftAxis, Joystick rightAxis) {
        robotDrive4Motors.tankDrive(leftAxis, rightAxis);
        //Squared inputs?
    }
    
    public void tankDriveWithValues(double leftAxis, double rightAxis) {
        robotDrive4Motors.tankDrive(leftAxis, rightAxis);
    }
    public double getLeftEncoderDistance() {
        return leftEncoder.getDistance();
    }
    
    public void resetEncoder() {
        driveEncoder.reset();
    }
    public double getGyro() {
        return gyro.getAngle();
    }
    public void resetGyro() {
        gyro.reset();
    }
    /*public boolean inPosition(double minDist, double maxDist) {
        //Convert to feet.
        minDist /= 12;
        maxDist /= 12;
        return (distanceSensor.getRangeInches() <= maxDist && distanceSensor.getRangeInches() >= minDist);
    }
    public double getDistanceSensor() {
        return distanceSensor.getRangeInches();
    }*/
    public void setInPosistionIndicator(boolean on) {
        //We may possibly have some sort of indicator on the robot for the robot's position.
        inPositionIndicator.set(on);
    }
    
    public void stopDriveMotors(){
        robotDrive4Motors.tankDrive(0, 0);
    }
    
    public void changeDriveMode(){
        useTankDrive = !useTankDrive;
    }
    
    public boolean shouldUseTankDrive(){
        return useTankDrive;
    }
    
}
