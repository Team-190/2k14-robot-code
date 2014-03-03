package org.usfirst.frc190.CurrentRobotProject;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import org.usfirst.frc190.CurrentRobotProject.subsystems.*;
//The VM is configured to automatically run this class, and to call the
//functions corresponding to each mode, as described in the IterativeRobot
//documentation. If you change the name of this class or the package after
//creating this project, you must also update the manifest file in the resource
//directory.
public class Robot extends IterativeRobot {
    Command autonomousCommand;
    public static OI oi;
    public static ArduinoComm I2CComm;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Drivetrain drivetrain;
    public static Collector collector;
    public static Shooter shooter;
    public static Pneumatics pneumatics;
    public static Pivot pivot;;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public SendableChooser autoChooser;
    public SendableChooser autonomousDirectionChooser;
    private static Robot instance = null;
    //This function is run when the robot is first started up and should be
    //used for any initialization code.
    
    public static Robot getInstance() {
        return instance;
    }
    
    public boolean isTeleopMode() {
        return isOperatorControl();
    }
    public void robotInit() {
        instance = this;
        RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrain = new Drivetrain();
        collector = new Collector();
        shooter = new Shooter();
        pneumatics = new Pneumatics();
        pivot = new Pivot();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        I2CComm = ArduinoComm.getInstance();
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS        
        autoChooser = new SendableChooser();
        autoChooser.addObject("Mobility Only", new AutoMobilityOnly());
        autoChooser.addObject("One Ball Auto Far", new OneBallAutoFar());
        autoChooser.addDefault("One Ball Auto Close", new OneBallAutoClose());
        autoChooser.addObject("Two Ball Straight", new TwoBallAutoStraight());
        SmartDashboard.putData("Auto Mode", autoChooser);
        Robot.pneumatics.startCompressor(); //Start the compressor working.
    }
    public void autonomousInit() {
        pneumatics.setArduinoSignal(false);
        Command auto = (Command) autoChooser.getSelected();
        auto.start();
    }
    //This function is called periodically during autonomous
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        Robot.pneumatics.writePressure();
    } 
    public void teleopInit() {
        pneumatics.setArduinoSignal(false);
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) {
            autonomousCommand.cancel();
        }
        Robot.pivot.disable(); //Stop PID loops that began in auto. 
    }
    //This function is called periodically during operator control
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        Robot.pneumatics.writePressure();
        SmartDashboard.putNumber("Pivot Pot Value", Robot.pivot.getPotValue());
    }
    //This function called periodically during test mode
    public void testPeriodic() {
        pneumatics.setArduinoSignal(false);
        LiveWindow.run();
    }
    
    public void disabledInit(){
        pneumatics.setArduinoSignal(true);
    }
}
