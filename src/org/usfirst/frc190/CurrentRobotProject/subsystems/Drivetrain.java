package org.usfirst.frc190.CurrentRobotProject.subsystems;

import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    SpeedController cIM1 = RobotMap.drivetrainCIM1;
    SpeedController cIM2 = RobotMap.drivetrainCIM2;
    SpeedController cIM3 = RobotMap.drivetrainCIM3;
    SpeedController cIM4 = RobotMap.drivetrainCIM4;
    RobotDrive robotDrive4Motors = RobotMap.drivetrainRobotDrive4Motors;
    Encoder leftEncoder = RobotMap.drivetrainLeftEncoder;
    Encoder rightEncoder = RobotMap.drivetrainRightEncoder;
    Ultrasonic distanceSensor = RobotMap.drivetrainDistanceSensor;
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
<<<<<<< HEAD
    public void tankDriveWithJoysitcks(Joystick leftAxis, Joystick rightAxis) {
        robotDrive4Motors.tankDrive(leftAxis, rightAxis);
        //Squared inputs?
    }
    
    public void tankDriveWithValues(double leftAxis, double rightAxis) {
=======

    public void tankDrive(double leftAxis, double rightAxis) {
>>>>>>> 1602907022cfcf5b51ea147960f4dd73a010f7f0
        robotDrive4Motors.tankDrive(leftAxis, rightAxis);
        //Squared inputs?
    }

    public double getLeftEncoderDistance() {
        return leftEncoder.getDistance();
    }

    public double getRightEncoderDistance() {
        return rightEncoder.getDistance();
    }

    public void resetDriveEncoders() {
        leftEncoder.reset();
        rightEncoder.reset();
    }

    public double getGyro() {
        return gyro.getAngle();
    }

    public void resetGyro() {
        gyro.reset();
    }

    public boolean inPosition(double minDist, double maxDist) {
        //Convert to feet.
        minDist /= 12;
        maxDist /= 12;
        return (distanceSensor.getRangeInches() <= maxDist && distanceSensor.getRangeInches() >= minDist);
    }

    public double getDistanceSensor() {
        return distanceSensor.getRangeInches();
    }

    public void setInPosistionIndicator(boolean on) {
        //We may possibly have some sort of indicator on the robot for the robot's position.
        inPositionIndicator.set(on);
    }
    
    public void stopDriveMotors(){
        robotDrive4Motors.tankDrive(0, 0);
    }
}
