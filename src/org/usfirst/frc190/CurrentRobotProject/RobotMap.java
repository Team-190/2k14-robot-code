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
import edu.wpi.first.wpilibj.DigitalOutput;
//The RobotMap is a mapping from the ports sensors and actuators are wired into
//to a variable name. This provides flexibility changing wiring, makes checking
//the wiring easier and significantly reduces the number of magic numbers
//floating around.
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainFrontLeftCIM;
    public static SpeedController drivetrainFrontRightCIM;
    public static SpeedController drivetrainBackLeftCIM;
    public static SpeedController drivetrainBackRightCIM;
    public static RobotDrive drivetrainRobotDrive4Motors;
    public static Encoder drivetrainDriveEncoder;
    public static Gyro drivetrainGyro;
    public static SpeedController collectorRollerMotor;
    public static DigitalInput collectorBallDetector;
    public static DigitalInput collectorClawReedSwitch;
    public static Solenoid collectorClawPiston;
    public static DigitalInput shooterHotGoalSensor;
    public static DoubleSolenoid shooterPiston1;
    public static DoubleSolenoid shooterPiston2;
    public static Solenoid shooterLatchPiston;
    public static DigitalInput shooterPiston1ReedSwitchFront;
    public static DigitalInput shooterPiston1ReedSwitchBack;
    public static AnalogChannel pneumaticsPressureSensor;
    public static Compressor pneumaticsCompressor;
    public static DigitalInput pivotUpperLimitSwitch;
    public static DigitalInput pivotLowerLimitSwitch;
    public static AnalogChannel pivotPot;
    public static SpeedController pivotMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainFrontLeftCIM = new Victor(1, 1);
	LiveWindow.addActuator("Drivetrain", "FrontLeftCIM", (Victor) drivetrainFrontLeftCIM);
        
        drivetrainFrontRightCIM = new Victor(1, 2);
	LiveWindow.addActuator("Drivetrain", "FrontRightCIM", (Victor) drivetrainFrontRightCIM);
        
        drivetrainBackLeftCIM = new Victor(1, 3);
	LiveWindow.addActuator("Drivetrain", "BackLeftCIM", (Victor) drivetrainBackLeftCIM);
        
        drivetrainBackRightCIM = new Victor(1, 4);
	LiveWindow.addActuator("Drivetrain", "BackRightCIM", (Victor) drivetrainBackRightCIM);
        
        drivetrainRobotDrive4Motors = new RobotDrive(drivetrainFrontLeftCIM, drivetrainBackLeftCIM,
              drivetrainFrontRightCIM, drivetrainBackRightCIM);
	
        drivetrainRobotDrive4Motors.setSafetyEnabled(true);
        drivetrainRobotDrive4Motors.setExpiration(0.1);
        drivetrainRobotDrive4Motors.setSensitivity(0.5);
        drivetrainRobotDrive4Motors.setMaxOutput(1.0);
        drivetrainRobotDrive4Motors.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drivetrainRobotDrive4Motors.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        drivetrainRobotDrive4Motors.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrainRobotDrive4Motors.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        drivetrainDriveEncoder = new Encoder(1, 1, 1, 2, true, EncodingType.k1X);
	LiveWindow.addSensor("Drivetrain", "Drive Encoder", drivetrainDriveEncoder);
        drivetrainDriveEncoder.setDistancePerPulse(0.0785398);
        drivetrainDriveEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        drivetrainDriveEncoder.start();
        drivetrainGyro = new Gyro(1, 2);
	LiveWindow.addSensor("Drivetrain", "Gyro", drivetrainGyro);
        drivetrainGyro.setSensitivity(0.007);
        collectorRollerMotor = new Victor(1, 6);
	LiveWindow.addActuator("Collector", "Roller Motor", (Victor) collectorRollerMotor);
        
        collectorBallDetector = new DigitalInput(1, 10);
	LiveWindow.addSensor("Collector", "Ball Detector", collectorBallDetector);
        
        collectorClawReedSwitch = new DigitalInput(1, 4);
	LiveWindow.addSensor("Collector", "Claw Reed Switch", collectorClawReedSwitch);
        
        collectorClawPiston = new Solenoid(1, 1);
	LiveWindow.addActuator("Collector", "Claw Piston", collectorClawPiston);
        
        shooterHotGoalSensor = new DigitalInput(1, 3);
	LiveWindow.addSensor("Shooter", "Hot Goal Sensor", shooterHotGoalSensor);
        
        shooterPiston1 = new DoubleSolenoid(1, 3, 4);      
	
        
        shooterPiston2 = new DoubleSolenoid(1, 5, 6);      
	
        
        shooterLatchPiston = new Solenoid(1, 2);
	LiveWindow.addActuator("Shooter", "Latch Piston", shooterLatchPiston);
        
        shooterPiston1ReedSwitchFront = new DigitalInput(1, 9);
	LiveWindow.addSensor("Shooter", "Piston1 Reed Switch Front ", shooterPiston1ReedSwitchFront);
        
        shooterPiston1ReedSwitchBack = new DigitalInput(1, 11);
	LiveWindow.addSensor("Shooter", "Piston1 Reed Switch Back ", shooterPiston1ReedSwitchBack);
        
        pneumaticsPressureSensor = new AnalogChannel(1, 3);
	LiveWindow.addSensor("Pneumatics", "Pressure Sensor", pneumaticsPressureSensor);
        
        pneumaticsCompressor = new Compressor(1, 8, 1, 8);
	
        
        pivotUpperLimitSwitch = new DigitalInput(1, 13);
	LiveWindow.addSensor("Pivot", "Upper Limit Switch", pivotUpperLimitSwitch);
        
        pivotLowerLimitSwitch = new DigitalInput(1, 12);
	LiveWindow.addSensor("Pivot", "Lower Limit Switch", pivotLowerLimitSwitch);
        
        pivotPot = new AnalogChannel(1, 1);
	LiveWindow.addSensor("Pivot", "Pot", pivotPot);
        
        pivotMotor = new Victor(1, 5);
	LiveWindow.addActuator("Pivot", "Motor", (Victor) pivotMotor);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
