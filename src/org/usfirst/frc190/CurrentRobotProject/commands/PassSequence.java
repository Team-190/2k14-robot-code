//This is the main command for Passing in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class PassSequence extends CommandGroup {
    
    public  PassSequence() {
        addSequential(new PivotLower());
        addSequential(new WaitForBoomButton());
        addSequential(new OpenClaw());
        addSequential(new WaitCommand(.75));
        addSequential(new PivotStoredPosition());
    }
}
