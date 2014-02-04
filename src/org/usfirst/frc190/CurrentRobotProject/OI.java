package org.usfirst.frc190.CurrentRobotProject;
import edu.wpi.first.wpilibj.DriverStation;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
//This class is the glue that binds the controls on the physical operator
//interface to the commands and command groups that allow control of the robot.
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
    public DigitalIOButton armRaiseButton;
    public DigitalIOButton armLowerButton;
    public DigitalIOButton fireButton;
    public DigitalIOButton collectButton;
    public DigitalIOButton shootFarButton;
    public DigitalIOButton shootTrussButton;
    public DigitalIOButton passButton;
    public DigitalIOButton storeButton;
    public DigitalIOButton collectorInButton;
    public DigitalIOButton collectorOutButton;
    public DigitalIOButton clawOpenButton;
    public DigitalIOButton clawClosedButton;
    public DigitalIOButton latchButton;
    public DigitalIOButton piston1OutButton;
    public DigitalIOButton piston1InButton;
    public DigitalIOButton piston2OutButton;
    public DigitalIOButton piston2EmptyButton;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        piston2EmptyButton = new DigitalIOButton(1);
        piston2EmptyButton.whenPressed(new DepressurizePiston2());
        piston2OutButton = new DigitalIOButton(1);
        piston2OutButton.whenPressed(new PressurizePiston2());
        piston1InButton = new DigitalIOButton(1);
        piston1InButton.whenPressed(new RetractPiston1());
        piston1OutButton = new DigitalIOButton(1);
        piston1OutButton.whenPressed(new ExtendPiston1());
        latchButton = new DigitalIOButton(1);
        latchButton.whileHeld(new ExtendLatch());
        clawClosedButton = new DigitalIOButton(1);
        clawClosedButton.whenPressed(new CloseClaw());
        clawOpenButton = new DigitalIOButton(1);
        clawOpenButton.whenPressed(new OpenClaw());
        collectorOutButton = new DigitalIOButton(1);
        collectorOutButton.whileHeld(new RollersBackward());
        collectorInButton = new DigitalIOButton(1);
        collectorInButton.whileHeld(new RollersForward());
        storeButton = new DigitalIOButton(1);
        storeButton.whenPressed(new MoveArmToStored());
        passButton = new DigitalIOButton(1);
        passButton.whenPressed(new Pass());
        shootTrussButton = new DigitalIOButton(1);
        shootTrussButton.whenPressed(new ShootTruss());
        shootFarButton = new DigitalIOButton(1);
        shootFarButton.whenPressed(new ShootFar());
        collectButton = new DigitalIOButton(4);
        collectButton.whenPressed(new Collect());
        fireButton = new DigitalIOButton(3);
        fireButton.whenPressed(new Fire());
        armLowerButton = new DigitalIOButton(2);
        armLowerButton.whileHeld(new ArmLower());
        armRaiseButton = new DigitalIOButton(1);
        armRaiseButton.whileHeld(new ArmRaise());
        rightJoystick = new Joystick(2);
        
        leftJoystick = new Joystick(1);
        
	    
        // SmartDashboard Buttons
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
        SmartDashboard.putData("Wait For Extended", new WaitForExtended());
        SmartDashboard.putData("Wait For Retracted", new WaitForRetracted());
        SmartDashboard.putData("Auto Manuver", new AutoManuver());
        SmartDashboard.putData("Drive Forward", new DriveForward());
        SmartDashboard.putData("Move Arm To Stored", new MoveArmToStored());
        SmartDashboard.putData("SwitchToArcadeDrive", new SwitchToArcadeDrive());
        SmartDashboard.putData("Arm Up", new ArmUp());
        SmartDashboard.putData("Arm Down", new ArmDown());
        SmartDashboard.putData("DriveTrainTest", new DriveTrainTest());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }
    public Joystick getRightJoystick() {
        return rightJoystick;
    }
    public boolean getAutomaticSwitch() {
        return DriverStation.getInstance().getDigitalIn(1);
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    
    
}
