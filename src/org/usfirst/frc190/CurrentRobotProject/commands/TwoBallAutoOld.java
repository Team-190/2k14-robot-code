//


package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class TwoBallAutoOld extends CommandGroup {
    
    public  TwoBallAutoOld() {
        //addSequential(new WaitCommand(1));
        //addSequential(new CheckForHotGoal(2.5));
        addSequential(new DriveForwardSpeed(1, 1, 0.5, false));
        addSequential(new DriveForwardSpeed(0.5, 0.5, 2.5, false));
        addSequential(new WaitCommand(0.5));
        addSequential(new DriveForwardSpeed(-0.5, -0.5, 0.15, false));
        addSequential(new PrepareShootTruss());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
