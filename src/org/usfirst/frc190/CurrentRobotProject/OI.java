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
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public DigitalIOButton raiseArmButton;
    public DigitalIOButton armLowerButton;
    public DigitalIOButton fireButton;
    public DigitalIOButton collectButton;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        collectButton = new DigitalIOButton(4);
        collectButton.whenPressed(new Collect());
        fireButton = new DigitalIOButton(3);
        fireButton.whenPressed(new Fire());
        armLowerButton = new DigitalIOButton(2);
        armLowerButton.whileHeld(new ArmLower());
        raiseArmButton = new DigitalIOButton(1);
        raiseArmButton.whileHeld(new ArmRaise());
        rightJoystick = new Joystick(2);
        
        leftJoystick = new Joystick(1);
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Move Arm", new MoveArm());
        SmartDashboard.putData("Drive Forward", new DriveForward());
        SmartDashboard.putData("One Ball Auto", new OneBallAuto());
        SmartDashboard.putData("Move Arm To Point", new MoveArmToPoint());
        SmartDashboard.putData("Check For Hot Goal", new CheckForHotGoal());
        SmartDashboard.putData("Two Ball Auto", new TwoBallAuto());
        SmartDashboard.putData("Pass", new Pass());
        SmartDashboard.putData("Fire", new Fire());
        SmartDashboard.putData("Shoot Truss", new ShootTruss());
        SmartDashboard.putData("Shoot Far", new ShootFar());
        SmartDashboard.putData("Drive Spin", new DriveSpin());
        SmartDashboard.putData("Arm Lower", new ArmLower());
        SmartDashboard.putData("Arm Raise", new ArmRaise());
        SmartDashboard.putData("Arm Down", new ArmDown());
        SmartDashboard.putData("Arm Up", new ArmUp());
        SmartDashboard.putData("Rollers Backward", new RollersBackward());
        SmartDashboard.putData("Rollers Forward", new RollersForward());
        SmartDashboard.putData("Rollers Stop", new RollersStop());
        SmartDashboard.putData("Open Claw", new OpenClaw());
        SmartDashboard.putData("Close Claw", new CloseClaw());
        SmartDashboard.putData("Extend Piston 1", new ExtendPiston1());
        SmartDashboard.putData("Retract Piston 1", new RetractPiston1());
        SmartDashboard.putData("Pressurize Piston 2", new PressurizePiston2());
        SmartDashboard.putData("Depressurize Piston 2", new DepressurizePiston2());
        SmartDashboard.putData("Extend Latch", new ExtendLatch());
        SmartDashboard.putData("Retract Latch", new RetractLatch());
        SmartDashboard.putData("Piston 1 Off", new Piston1Off());
        SmartDashboard.putData("Collect", new Collect());
        SmartDashboard.putData("Wait For Collection", new WaitForCollection());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }
    public Joystick getRightJoystick() {
        return rightJoystick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
