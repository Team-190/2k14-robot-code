package org.usfirst.frc190.CurrentRobotProject;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
public class OI {
    private static boolean inManualMode = false;
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public JoystickButton toggleLatchButton;
    public JoystickButton piston1ExtendButton;
    public JoystickButton piston1RetractButton;
    public JoystickButton piston2ExtendButton;
    public JoystickButton piston2RetractButton;
    public JoystickButton autonomoustoManualControls;
    public JoystickButton clawOpen;
    public JoystickButton clawClosed;
    public Joystick oIJoystick;
    public JoystickButton shootFarSequenceButton;
    public JoystickButton shootTrussSequenceButton;
    public JoystickButton passSequenceButton;
    public JoystickButton pivotStoredPositionButton;
    public JoystickButton boomButton;
    public JoystickButton rollersInButton;
    public JoystickButton rollersOutButton;
    public JoystickButton pivotRaiseButton;
    public JoystickButton pivotLowerButton;
    public JoystickButton collectSequenceButton;
    public Joystick oIJoystick2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        oIJoystick2 = new Joystick(4);
        
        collectSequenceButton = new JoystickButton(oIJoystick2, 7);
        collectSequenceButton.whenPressed(new Collect());
        pivotLowerButton = new JoystickButton(oIJoystick2, 5);
        pivotLowerButton.whileHeld(new PivotLower());
        pivotRaiseButton = new JoystickButton(oIJoystick2, 4);
        pivotRaiseButton.whileHeld(new PivotRaise());
        rollersOutButton = new JoystickButton(oIJoystick2, 3);
        rollersOutButton.whileHeld(new RollersOutThenStop());
        rollersInButton = new JoystickButton(oIJoystick2, 2);
        rollersInButton.whileHeld(new RollersInThenStop());
        boomButton = new JoystickButton(oIJoystick2, 6);
        boomButton.whenPressed(new WaitForBoomButton());
        pivotStoredPositionButton = new JoystickButton(oIJoystick2, 8);
        pivotStoredPositionButton.whenPressed(new PivotStoredPosition());
        passSequenceButton = new JoystickButton(oIJoystick2, 9);
        passSequenceButton.whenPressed(new PassSequence());
        shootTrussSequenceButton = new JoystickButton(oIJoystick2, 10);
        shootTrussSequenceButton.whenPressed(new ShootTrussSequence());
        shootFarSequenceButton = new JoystickButton(oIJoystick2, 11);
        shootFarSequenceButton.whenPressed(new ShootFarSequence());
        oIJoystick = new Joystick(3);
        
        clawClosed = new JoystickButton(oIJoystick, 7);
        clawClosed.whenPressed(new CloseClaw());
        clawOpen = new JoystickButton(oIJoystick, 6);
        clawOpen.whenPressed(new OpenClaw());
        autonomoustoManualControls = new JoystickButton(oIJoystick, 9);
        autonomoustoManualControls.whileHeld(new SwitchtoManualControlMode());
        piston2RetractButton = new JoystickButton(oIJoystick, 3);
        piston2RetractButton.whenPressed(new RetractPiston2());
        piston2ExtendButton = new JoystickButton(oIJoystick, 5);
        piston2ExtendButton.whenPressed(new ExtendPiston2());
        piston1RetractButton = new JoystickButton(oIJoystick, 2);
        piston1RetractButton.whenPressed(new RetractPiston1());
        piston1ExtendButton = new JoystickButton(oIJoystick, 4);
        piston1ExtendButton.whenPressed(new ExtendPiston1());
        toggleLatchButton = new JoystickButton(oIJoystick, 1);
        toggleLatchButton.whenPressed(new ToggleLatch());
        rightJoystick = new Joystick(2);
        
        leftJoystick = new Joystick(1);
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Send Message to Arduino", new SendMessagetoArduino());
        SmartDashboard.putData("Auto Mobility Only", new AutoMobilityOnly());
        SmartDashboard.putData("One Ball Auto Far", new OneBallAutoFar());
        SmartDashboard.putData("One Ball Auto Close", new OneBallAutoClose());
        SmartDashboard.putData("Two Ball Auto Straight", new TwoBallAutoStraight());
        SmartDashboard.putData("Check For Hot Goal", new CheckForHotGoal());
        SmartDashboard.putData("Wait For Collection", new WaitForCollection());
        SmartDashboard.putData("Wait For Extended", new WaitForExtended());
        SmartDashboard.putData("Wait For Retracted", new WaitForRetracted());
        SmartDashboard.putData("Drive Spin", new DriveSpin());
        SmartDashboard.putData("Drive Forward", new DriveForward());
        SmartDashboard.putData("Switch Drive Mode", new SwitchDriveMode());
        SmartDashboard.putData("Collect", new Collect());
        SmartDashboard.putData("Collect With Timeout", new CollectWithTimeout());
        SmartDashboard.putData("Fire", new Fire());
        SmartDashboard.putData("Prepare Shoot Far", new PrepareShootFar());
        SmartDashboard.putData("Prepare Shoot Truss", new PrepareShootTruss());
        SmartDashboard.putData("Rollers Backward", new RollersBackward());
        SmartDashboard.putData("Rollers Forward", new RollersForward());
        SmartDashboard.putData("Rollers Stop", new RollersStop());
        SmartDashboard.putData("Open Claw", new OpenClaw());
        SmartDashboard.putData("Close Claw", new CloseClaw());
        SmartDashboard.putData("Extend Piston 1", new ExtendPiston1());
        SmartDashboard.putData("Retract Piston 1", new RetractPiston1());
        SmartDashboard.putData("Extend Piston 2", new ExtendPiston2());
        SmartDashboard.putData("Retract Piston 2", new RetractPiston2());
        SmartDashboard.putData("Piston 1 Off", new Piston1Off());
        SmartDashboard.putData("Piston 2 Off", new Piston2Off());
        SmartDashboard.putData("Retract Latch", new RetractLatch());
        SmartDashboard.putData("Extend Latch", new ExtendLatch());
        SmartDashboard.putData("Pivot Lower", new PivotLower());
        SmartDashboard.putData("Pivot Raise", new PivotRaise());
        SmartDashboard.putData("Pivot Down Position", new PivotDownPosition());
        SmartDashboard.putData("Pivot Stored Position", new PivotStoredPosition());
        SmartDashboard.putData("Pivot Far Position", new PivotFarPosition());
        SmartDashboard.putData("Pivot Truss Position", new PivotTrussPosition());
        SmartDashboard.putData("Wait For Boom Button", new WaitForBoomButton());
        SmartDashboard.putData("Shoot Far Sequence", new ShootFarSequence());
        SmartDashboard.putData("Pass Sequence", new PassSequence());
        SmartDashboard.putData("Set Control Mode Auto", new SetControlModeAuto());
        SmartDashboard.putData("Set Control Mode Manual", new SetControlModeManual());
        SmartDashboard.putData("Switch to Auto Control Mode", new SwitchtoAutoControlMode());
        SmartDashboard.putData("Switch to Manual Control Mode", new SwitchtoManualControlMode());
        SmartDashboard.putData("Switch OI Control Mode", new SwitchOIControlMode());
        SmartDashboard.putData("Switch Drive Inputs", new SwitchDriveInputs());
        SmartDashboard.putData("RollersInThenStop", new RollersInThenStop());
        SmartDashboard.putData("RollersOutThenStop", new RollersOutThenStop());
        SmartDashboard.putData("Toggle Latch", new ToggleLatch());
        SmartDashboard.putData("Drive Distance", new DriveDistance());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }
    public Joystick getRightJoystick() {
        return rightJoystick;
    }
    public Joystick getOIJoystick() {
        return oIJoystick;
    }
    public Joystick getOIJoystick2() {
        return oIJoystick2;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public void setInManualMode(boolean mode) {
        inManualMode = mode;
    }
    
    public boolean getInManualMode() {
        return inManualMode;
    }
    
    public void switchOIControlMode() {
        inManualMode = !inManualMode;
    }
    
    
}
