// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc190.CurrentRobotProject.subsystems;
import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import org.usfirst.frc190.CurrentRobotProject.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid shooterPiston1 = RobotMap.shooterShooterPiston1;
    DoubleSolenoid shooterPiston2 = RobotMap.shooterShooterPiston2;
    DoubleSolenoid latchPiston = RobotMap.shooterLatchPiston;
    DigitalInput reedSwitch1 = RobotMap.shooterReedSwitch1;
    DigitalInput reedSwitch2 = RobotMap.shooterReedSwitch2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void extendBoth() {
        shooterPiston1.set(DoubleSolenoid.Value.kForward);
        shooterPiston2.set(DoubleSolenoid.Value.kForward);
    }
    public void retractBoth() {
        shooterPiston1.set(DoubleSolenoid.Value.kReverse);
        shooterPiston2.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void extend1(){
        shooterPiston1.set(DoubleSolenoid.Value.kForward);
    }
    
    public void retract1(){
        shooterPiston1.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void pressurize2(){
        shooterPiston2.set(DoubleSolenoid.Value.kForward);
    }
    
    public void depressurize2(){
        shooterPiston2.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void unlatch() {
        latchPiston.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void latch() {
        latchPiston.set(DoubleSolenoid.Value.kForward);
    }
}
