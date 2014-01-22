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

/**
 *
 */
public class TwoBallAuto extends CommandGroup {
    
    private double collectionTimeout = 2; //Needs to be tested.
    
    public  TwoBallAuto() {
        addSequential(new ShootFar());
        //Wait for Hot Goal. OR NOT?
        addSequential(new Fire());
        addSequential(new Collect(collectionTimeout));
        //We need to at a case here:
        //Collect(); ShootFar(); Fire(); Drive Forward(); DriveSpin();
        //If a timeout Happens: DriveForward(); DriveSpin();
        
        //What we should do is do the proceedure assuming it works, and just at
        //the end of the time, we drive forward to get the mobility points
        // and if we fire before that, we then spin around
        
        
        /*
        addSequential(new DepressurizePiston2());
        addSequential(new WaitCommand(.3));
        addSequential(new ExtendPiston1());
        addSequential(new WaitCommand(.2));
        addSequential(new PressurizePiston2());
        addSequential(new WaitCommand(.5));
        addSequential(new Fire());
        //addSequential(new Collect());
        addSequential(new WaitCommand(0.5));
        
        addSequential(new OneBallAuto());
        addSequential(new WaitCommand(0.5));
        */
        
    }
}
