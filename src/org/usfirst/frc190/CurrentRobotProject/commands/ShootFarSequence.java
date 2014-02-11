//This is the command group for the full Shoot Far sequence in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootFarSequence extends CommandGroup {
    
    public  ShootFarSequence() {
        addSequential(new PrepareShootFar());
        addSequential(new WaitForBoomButton());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
