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
public class Fire extends CommandGroup {
    
    public  Fire() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        
        //TODO: check to see if aimed or in auto.
        //addSequential(new OpenClaw());
        //TODO: Check reed switch for OpenClaw()
        addSequential(new ExtendLatch());
        
        while(!Robot.shooter.piston1IsExtended()){
            //Block while we are waiting for the piston to extend.
        }
        addSequential(new DepressurizePiston2());
        addSequential(new RetractPiston1());
        
        while(!Robot.shooter.piston1IsRetracted()){
            //Block while we are waiting for the piston to retract.
        }
        
        addSequential(new RetractLatch());
        //addSequential(new Closeclaw());
        addSequential(new ExtendPiston1());
    }
}
