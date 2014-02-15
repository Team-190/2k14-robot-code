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
public class CollectThenStoredWithTimeout extends CommandGroup {
    
    private double timeout = 5;
    
    public  CollectThenStoredWithTimeout() {
        //This command uses a timeout and ends by putting the pivot in the store position

        addParallel(new PivotLower());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection(timeout));
        addParallel(new RollersStop());
        addSequential(new PivotStoredPosition());
    }
}