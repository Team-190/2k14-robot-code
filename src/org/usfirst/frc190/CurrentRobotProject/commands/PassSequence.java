//This is the main command for Passing in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class PassSequence extends CommandGroup {
    
    public  PassSequence() {
        addSequential(new PivotDownPosition());
        addSequential(new WaitForBoomButton());
        addSequential(new RollersBackward());
        addSequential(new WaitCommand(3));
        addSequential(new PivotStoredPosition());
    }
}
