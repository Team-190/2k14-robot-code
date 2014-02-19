//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class OneBallAutoMovement extends CommandGroup {
    
    public  OneBallAutoMovement() {
        addSequential(new DriveForward());
        addSequential(new PrepareShootFar());
        addSequential(new CheckForHotGoal()); //Checks for hot goal
            //If hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after a timeout.
        addSequential(new Fire());
        //addSequential(new DriveSpin());
    }
}
