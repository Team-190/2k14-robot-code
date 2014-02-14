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
    //This function is run when the robot is first started up and should be
    //used for any initialization code.
    public void robotInit() {
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
        I2CComm = new ArduinoComm();
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand = new OneBallAuto();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS        
        autoChooser = new SendableChooser();
        autoChooser.addDefault("Mobility Only", new AutoMobilityOnly());
        autoChooser.addObject("One Ball Auto", new OneBallAuto());
        autoChooser.addObject("Two Ball No Movement", new TwoBallAutoNoMovement());
        autoChooser.addObject("Two Ball Forward", new TwoBallAutoForward());
        autoChooser.addObject("Two Ball Left", new TwoBallAutoLeft());
        autoChooser.addObject("Two Ball Right", new TwoBallAutoRight());
        SmartDashboard.putData("Auto Mode", autoChooser);
        Robot.pneumatics.startCompressor(); //Start the compressor working.
    }
    public void autonomousInit() {
        Command auto = (Command) autoChooser.getSelected();
        auto.start();
    }
    //This function is called periodically during autonomous
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) {
            autonomousCommand.cancel();
        }
    }
    //This function is called periodically during operator control
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    //This function called periodically during test mode
    public void testPeriodic() {
        LiveWindow.run();
    }
    
    
}
