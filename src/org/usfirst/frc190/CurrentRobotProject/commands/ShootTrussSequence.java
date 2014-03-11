//This is the command group for the full Shoot Truss sequence in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootTrussSequence extends CommandGroup {
    
    public  ShootTrussSequence() {
        addSequential(new PrepareShootTruss());
        //addSequential(new WaitForPressure());
        addSequential(new WaitForBoomButton());
        addSequential(new WaitForBoomRelease());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new RollersInThenStop(5));
        addSequential(new PivotStoredPosition());
    }
}
