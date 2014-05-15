//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class OneBallAutoClose extends CommandGroup {
    
    public  OneBallAutoClose() {
        addSequential(new WaitCommand(0.5));
        addSequential(new CheckForHotGoal(2));
        addSequential(new RetractLatch());
        addSequential(new CloseClaw());
        addSequential(new DriveForward(1, 1, 1, false));
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new DriveForward(0.4, 0.4, 2, true));
        addSequential(new DriveForward(-0.5, -0.5, 0.3 , false));
        addSequential(new PivotAutoClose(1));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(3));
    }
}
