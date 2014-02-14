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

/**
 *
 */
public class CollectWithTimeout extends CommandGroup {
    
    private double timeout = 5;
    
    public  CollectWithTimeout() {
        //This command works the same as expected, except it will end the 
        //WaitForCollection command after a given time.
        //This should only need to be called for autonomous.

        addParallel(new PivotLower());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection(timeout));
        addSequential(new RollersStop());
   
    }
}
