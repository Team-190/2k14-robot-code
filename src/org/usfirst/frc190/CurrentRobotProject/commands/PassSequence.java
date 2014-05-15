//This is the main command for Passing in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class PassSequence extends CommandGroup {
    
    public  PassSequence() {
        /*addSequential(new PivotDownPosition());
        addSequential(new WaitForBoomButton());
        addSequential(new RollersBackward());
        addSequential(new WaitCommand(2));
        addSequential(new RollersStop());
        addSequential(new PivotStoredPosition());*/
        
        addSequential(new RetractPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotFarPosition());
        addSequential(new WaitCommand(0.5));
        addSequential(new ExtendLatch());
        addSequential(new WaitForBoomButton());
        addSequential(new RollersBackward());
        addSequential(new ExtendPiston1());
        addSequential(new WaitCommand(0.5));
        addSequential(new RetractPiston1());
        addSequential(new WaitCommand(0.5));
        addSequential(new RollersStop());
        addSequential(new PivotStoredPosition());
    }
}
