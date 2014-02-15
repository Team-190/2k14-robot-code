//This command shoots one ball in auto
//It uses a banner sensor to detect if the goal is hot
//it will fire the ball as soon as it sees that the goal is hot
//if for some reason the banner sensor fails, it will launch the ball
//after 5.5 second regardless of hot goal

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class OneBallAuto extends CommandGroup {
    
    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double finalSpinAngle = 180;  //angle for the final spin

    public OneBallAuto() {
        addSequential(new PrepareShootFar());
        addSequential(new CheckForHotGoal()); //Checks for hot goal
            //If hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after a timeout.
        addSequential(new Fire());
        addSequential(new DriveForward());
        addSequential(new DriveSpin());
    }
}
