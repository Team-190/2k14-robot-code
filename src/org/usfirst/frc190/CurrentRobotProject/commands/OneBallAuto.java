//This commandgroup needs to be review
//Two different cases for hotgoal detection

//This commandgroup shoots one ball in auto
//It uses the camera to detect if the goal is hot or not
//if the goal it hot, it shoots, if not it waits about 5 sec for the goal
//to become hot

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class OneBallAuto extends CommandGroup {
    
    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double finalSpinAngle = 180;  //angle for the final spin

    public OneBallAuto() {
        addSequential(new ShootFar());
        addSequential(new CheckForHotGoal()); //Checks for hot goal
            //If hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after a timeout.
        addSequential(new Fire());
        addSequential(new DriveForward(mobilityDist, maxSpeed));
        addSequential(new DriveSpin(finalSpinAngle, maxSpeed));
    }
}
