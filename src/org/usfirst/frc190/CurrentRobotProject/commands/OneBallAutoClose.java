//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class OneBallAutoClose extends CommandGroup {
    
    public  OneBallAutoClose() {
        /*
        This is the original one ball auto close, was changed to working low
        goal shot in St.Louis
        addSequential(new WaitCommand(1));
        addSequential(new CheckForHotGoal()); //Checks for hot goal
            //If hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after a timeout.
        addSequential(new DriveForward(22.5));
        addSequential(new ExtendPiston1());
        addSequential(new ExtendPiston2());
        addSequential(new PivotAutoClose());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        //addSequential(new DriveForward(25));
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(4));
        //addSequential(new DriveSpin());*/
        addSequential(new WaitCommand(0.5));
        addSequential(new CheckForHotGoal(2));
        addSequential(new RetractLatch());
        addSequential(new CloseClaw());
        addSequential(new DriveForwardSpeed(1, 1, 1, false));
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new DriveForwardSpeed(0.4, 0.4, 2, true));
        addSequential(new DriveForwardSpeed(-0.5, -0.5, 0.3 , false));
        addSequential(new PivotAutoClose(1));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(3));
    }
}
