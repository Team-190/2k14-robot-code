//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class OneBallAutoClose extends CommandGroup {
    
    public  OneBallAutoClose() {
        addSequential(new WaitCommand(1));
        addSequential(new CheckForHotGoal()); //Checks for hot goal
            //If hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after a timeout.
        addSequential(new DriveForward(22.5));
        addSequential(new ExtendPiston1());
        addSequential(new ExtendPiston2());
        addSequential(new PivotAutoClose());
        addSequential(new Fire());
        //addSequential(new DriveForward(25));
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(4));
        //addSequential(new DriveSpin());
    }
}
