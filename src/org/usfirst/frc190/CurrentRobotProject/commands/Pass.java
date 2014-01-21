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
public class Pass extends CommandGroup {
    
    public  Pass() {
        
        addSequential(new ArmDown());
        addSequential(new RollersBackward());
        //Do we want a delay in here, or just end the command group with the rollers moving until they're interupted?
    }
}
