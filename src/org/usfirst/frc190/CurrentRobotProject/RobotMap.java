// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc190.CurrentRobotProject;
    
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.Gyro;
import java.util.Vector;
import edu.wpi.first.wpilibj.DigitalOutput;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainCIM5;
    public static SpeedController drivetrainCIM6;
    public static RobotDrive drivetrainRobotDrive2Motors;
    public static SpeedController drivetrainCIM1;
    public static SpeedController drivetrainCIM2;
    public static SpeedController drivetrainCIM3;
    public static SpeedController drivetrainCIM4;
    public static RobotDrive drivetrainRobotDrive4Motors;
    public static Encoder drivetrainLeftEncoder;
    public static Encoder drivetrainRightEncoder;
    public static Ultrasonic drivetrainDistanceSensor;
    public static DigitalOutput drivetrainInPositionIndicator;
    public static Gyro drivetrainGyro;
    public static SpeedController collectorRollerMotor;
    public static DigitalInput collectorBallDetector;
    public static Servo collectorServo;
    public static DoubleSolenoid collectorClawCylinder;
    public static DigitalInput collectorClawReedSwitch;
    public static DoubleSolenoid shooterShooterPiston1;
    public static DigitalInput shooterPiston1ReedSwitch1;
    public static DigitalInput shooterPiston1ReedSwitch2;
    public static Solenoid shooterShooterPiston2;
    public static Solenoid shooterLatchPiston;
    public static Compressor pneumaticsCompressor;
    public static DigitalInput elevatorTopLimitSwitch;
    public static DigitalInput elevatorLowerLimitSwitch;
    public static AnalogChannel elevatorPot;
    public static SpeedController elevatorElevatorMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainCIM5 = new Victor(1, 3);
	LiveWindow.addActuator("Drivetrain", "CIM 5", (Victor) drivetrainCIM5);
        
        drivetrainCIM6 = new Victor(1, 4);
	LiveWindow.addActuator("Drivetrain", "CIM 6", (Victor) drivetrainCIM6);
        
        drivetrainRobotDrive2Motors = new RobotDrive(drivetrainCIM5, drivetrainCIM6);
	
        drivetrainRobotDrive2Motors.setSafetyEnabled(true);
        drivetrainRobotDrive2Motors.setExpiration(0.1);
        drivetrainRobotDrive2Motors.setSensitivity(0.5);
        drivetrainRobotDrive2Motors.setMaxOutput(1.0);
        
        drivetrainCIM1 = new Victor(1, 5);
	LiveWindow.addActuator("Drivetrain", "CIM 1", (Victor) drivetrainCIM1);
        
        drivetrainCIM2 = new Victor(1, 6);
	LiveWindow.addActuator("Drivetrain", "CIM 2", (Victor) drivetrainCIM2);
        
        drivetrainCIM3 = new Victor(1, 7);
	LiveWindow.addActuator("Drivetrain", "CIM 3", (Victor) drivetrainCIM3);
        
        drivetrainCIM4 = new Victor(1, 8);
	LiveWindow.addActuator("Drivetrain", "CIM 4", (Victor) drivetrainCIM4);
        
        drivetrainRobotDrive4Motors = new RobotDrive(drivetrainCIM1, drivetrainCIM2,
              drivetrainCIM3, drivetrainCIM4);
	
        drivetrainRobotDrive4Motors.setSafetyEnabled(true);
        drivetrainRobotDrive4Motors.setExpiration(0.1);
        drivetrainRobotDrive4Motors.setSensitivity(0.5);
        drivetrainRobotDrive4Motors.setMaxOutput(1.0);
        drivetrainLeftEncoder = new Encoder(1, 2, 1, 3, false, EncodingType.k4X);
	LiveWindow.addSensor("Drivetrain", "Left Encoder", drivetrainLeftEncoder);
        drivetrainLeftEncoder.setDistancePerPulse(1.0);
        drivetrainLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        drivetrainLeftEncoder.start();
        drivetrainRightEncoder = new Encoder(1, 4, 1, 5, false, EncodingType.k4X);
	LiveWindow.addSensor("Drivetrain", "Right Encoder", drivetrainRightEncoder);
        drivetrainRightEncoder.setDistancePerPulse(1.0);
        drivetrainRightEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        drivetrainRightEncoder.start();
        drivetrainDistanceSensor = new Ultrasonic(1, 6, 1, 7);
	LiveWindow.addSensor("Drivetrain", "Distance Sensor", drivetrainDistanceSensor);
        
        drivetrainInPositionIndicator = new DigitalOutput(1, 11);
	
        
        drivetrainGyro = new Gyro(1, 2);
	LiveWindow.addSensor("Drivetrain", "Gyro", drivetrainGyro);
        drivetrainGyro.setSensitivity(0.007);
        collectorRollerMotor = new Victor(1, 1);
	LiveWindow.addActuator("Collector", "Roller Motor", (Victor) collectorRollerMotor);
        
        collectorBallDetector = new DigitalInput(1, 14);
	LiveWindow.addSensor("Collector", "Ball Detector", collectorBallDetector);
        
        collectorServo = new Servo(1, 2);
	LiveWindow.addActuator("Collector", "Servo", collectorServo);
        
        collectorClawCylinder = new DoubleSolenoid(1, 7, 8);      
	
        
        collectorClawReedSwitch = new DigitalInput(1, 10);
	LiveWindow.addSensor("Collector", "Claw Reed Switch", collectorClawReedSwitch);
        
        shooterShooterPiston1 = new DoubleSolenoid(1, 4, 5);      
	
        
        shooterPiston1ReedSwitch1 = new DigitalInput(1, 8);
	LiveWindow.addSensor("Shooter", "Piston1 Reed Switch 1", shooterPiston1ReedSwitch1);
        
        shooterPiston1ReedSwitch2 = new DigitalInput(1, 9);
	LiveWindow.addSensor("Shooter", "Piston1 Reed Switch 2", shooterPiston1ReedSwitch2);
        
        shooterShooterPiston2 = new Solenoid(1, 3);
	LiveWindow.addActuator("Shooter", "Shooter Piston 2", shooterShooterPiston2);
        
        shooterLatchPiston = new Solenoid(1, 1);
	LiveWindow.addActuator("Shooter", "Latch Piston", shooterLatchPiston);
        
        pneumaticsCompressor = new Compressor(1, 1, 1, 1);
	
        
        elevatorTopLimitSwitch = new DigitalInput(1, 13);
	LiveWindow.addSensor("Elevator", "Top Limit Switch", elevatorTopLimitSwitch);
        
        elevatorLowerLimitSwitch = new DigitalInput(1, 12);
	LiveWindow.addSensor("Elevator", "Lower Limit Switch", elevatorLowerLimitSwitch);
        
        elevatorPot = new AnalogChannel(1, 1);
	LiveWindow.addSensor("Elevator", "Pot", elevatorPot);
        
        elevatorElevatorMotor = new Victor(1, 9);
	LiveWindow.addActuator("Elevator", "Elevator Motor", (Victor) elevatorElevatorMotor);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
