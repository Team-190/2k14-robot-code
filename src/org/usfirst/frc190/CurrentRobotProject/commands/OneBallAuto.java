//This commandgroup needs to be review
//Two different cases for hotgoal detection

//This commandgroup shoots one ball in auto
//It uses the camera to detect if the goal is hot or not
//if the goal it hot, it shoots, if not it waits about 5 sec for the goal
//to become hot

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class OneBallAuto extends CommandGroup {

    public OneBallAuto() {

        addSequential(new ShootFar());
        addSequential(new CheckForHotGoal()); //checks for hot goal
            //if hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after five seconds
        addSequential(new Fire());
        //TODO: Check to make sure the methods below will always run.
        addSequential(new DriveForward());
        addSequential(new DriveSpin());
    }
}
