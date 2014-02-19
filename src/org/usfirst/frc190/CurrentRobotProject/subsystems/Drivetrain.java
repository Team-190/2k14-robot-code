package org.usfirst.frc190.CurrentRobotProject.subsystems;
import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
public class Drivetrain extends Subsystem {
        
    private static boolean useTankDrive = true;
    private static boolean useSquaredInputs = false;
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController frontLeftCIM = RobotMap.drivetrainFrontLeftCIM;
    SpeedController frontRightCIM = RobotMap.drivetrainFrontRightCIM;
    SpeedController backLeftCIM = RobotMap.drivetrainBackLeftCIM;
    SpeedController backRightCIM = RobotMap.drivetrainBackRightCIM;
    RobotDrive robotDrive4Motors = RobotMap.drivetrainRobotDrive4Motors;
    Encoder driveEncoderRight = RobotMap.drivetrainDriveEncoderRight;
    Encoder driveEncoderLeft = RobotMap.drivetrainDriveEncoderLeft;
    Gyro gyro = RobotMap.drivetrainGyro;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoysticks());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
    
    public void arcadeDrive(Joystick leftAxis){
        robotDrive4Motors.arcadeDrive(leftAxis, useSquaredInputs);
    }
    
    public void tankDrive(Joystick leftAxis, Joystick rightAxis) {
        robotDrive4Motors.tankDrive(leftAxis, rightAxis, useSquaredInputs);
        //Squared inputs?
    }
    
    public void tankDrive(double leftAxis, double rightAxis) {
        robotDrive4Motors.tankDrive(leftAxis, rightAxis);
    }
    public double getEncoderDistanceLeft() {
        return driveEncoderLeft.getDistance();
    }
    public void resetEncoderLeft() {
        driveEncoderLeft.reset();
    }
    
    public double getEncoderDistanceRight() {
        return driveEncoderRight.getDistance();
    }
    
    public void resetEncoderRight() {
        driveEncoderRight.reset();
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
    
    public void stopDriveMotors(){
        robotDrive4Motors.tankDrive(0, 0);
    }
    
    public void changeDriveMode(){
        useTankDrive = !useTankDrive;
    }
    
    public void setDriveModeTank(){
        useTankDrive = true;
    }
    
    public void setDriveModeArcade(){
        useTankDrive = false;
    }
    
    public boolean shouldUseTankDrive(){
        return useTankDrive;
    }
    
    public void changeInputMode(){
        useSquaredInputs = !useSquaredInputs;
    }
    
    public void setDriveInputSquared(){
        useSquaredInputs = true;
    }
    
    public void setDriveInputLinear(){
        useSquaredInputs = false;
    }
    
    public boolean getSquaredInput(){
        return useSquaredInputs;
    }
    
}
