

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;


public class SimpleDemoAuto extends CommandGroup {
    
    public  SimpleDemoAuto() {
        addSequential(new PivotStoredPosition(2));
        addSequential(new RetractLatch());
        addSequential(new CloseClaw());
        addSequential(new WaitCommand(0.15));
        addSequential(new ExtendPiston1());
        addSequential(new DriveDistance(100, 0.6));
        addSequential(new DriveForward(-0.5, -0.5, 0.5, false));
        addSequential(new PivotTrussPosition());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire(false));
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
