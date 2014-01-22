// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.Robot;

/**
 *
 */
public class ShootTruss extends CommandGroup {
    
    public  ShootTruss() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        
        //Add reed switch checking here. 
        //The two pistons only need to be retracted sometimes.
        //With reed switches we'll be able to tell when the pistons are pressurized but still held back.
        
        if(!Robot.shooter.piston1IsRetracted()){
            //If piston1 isn't fully retracted, retract it.
            addSequential(new DepressurizePiston2()); //piston2 must be depressurized in order for piston1 to retract.
            addSequential(new RetractPiston1());
            
            while(!Robot.shooter.piston1IsRetracted()){
                //Block while piston1 is retracting.
            }
            Robot.shooter.turnOffSolenoids();
        }
        
        addSequential(new RetractLatch());
        addSequential(new WaitCommand(.3));
        addSequential(new ExtendPiston1());
        //TODO: Aim Arm.
    }
}
