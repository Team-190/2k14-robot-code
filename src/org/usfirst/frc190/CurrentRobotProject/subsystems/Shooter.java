//Shooter Subsystem

package org.usfirst.frc190.CurrentRobotProject.subsystems;

import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
    //latchPiston needs to be changed to a double solenoid

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid shooterPiston1 = RobotMap.shooterShooterPiston1;
    DigitalInput piston1ReedSwitch1 = RobotMap.shooterPiston1ReedSwitch1;
    DigitalInput piston1ReedSwitch2 = RobotMap.shooterPiston1ReedSwitch2;
    Solenoid shooterPiston2 = RobotMap.shooterShooterPiston2;
    Solenoid latchPiston = RobotMap.shooterLatchPiston;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }

    public void extendBoth() {
        shooterPiston1.set(DoubleSolenoid.Value.kForward);
        shooterPiston2.set(true);
    }

    public void retractBoth() {
        shooterPiston1.set(DoubleSolenoid.Value.kReverse);
        shooterPiston2.set(false);
    }

    public void extend1() {
        shooterPiston1.set(DoubleSolenoid.Value.kForward);
    }

    public void retract1() {
        shooterPiston1.set(DoubleSolenoid.Value.kReverse);
    }

    public void off1() {
        shooterPiston1.set(DoubleSolenoid.Value.kOff);
    }

    public void pressurize2() {
        shooterPiston2.set(true);
    }

    public void depressurize2() {
        shooterPiston2.set(false);
    }

    public void unlatch() {
        latchPiston.set(true);
    }

    public void latch() {
        latchPiston.set(false);
    }

    public boolean piston1IsExtended() {
        return piston1ReedSwitch1.get();
    }

    public boolean piston1IsRetracted() {
        return piston1ReedSwitch2.get();
    }

    public void turnOffAllDoubleSolenoids() {
        //Turns off all double solenoids.
        //Double solenoids hold their position when they are turned off.
        //We should turn them off whenever possible to extend the life of the coils.
        shooterPiston1.set(DoubleSolenoid.Value.kOff);
        //May need to add more methods here if we use more double solenoids.
    }
}
