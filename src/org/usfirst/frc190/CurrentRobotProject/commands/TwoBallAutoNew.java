//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallAutoNew extends CommandGroup {
    
    public  TwoBallAutoNew() {
        //addSequential(new WaitCommand(1));
        //addSequential(new CheckForHotGoal(2.5));
        addSequential(new DriveForwardSpeed(1, 1, 1, false));
        addSequential(new DriveForwardSpeed(0.4, 0.4, 2, true));
        addSequential(new DriveForwardSpeed(-0.5, -0.5, 0.15, false));
        addSequential(new PrepareShootTruss());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
