//This command shoots one ball in auto
//It uses a banner sensor to detect if the goal is hot
//it will fire the ball as soon as it sees that the goal is hot
//if for some reason the banner sensor fails, it will launch the ball
//after 5.5 second regardless of hot goal

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class OneBallAutoFar extends CommandGroup {
    
    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double finalSpinAngle = 180;  //angle for the final spin

    public OneBallAutoFar() {
        /*
        Original One Ball Far from previous events, changed to new working code
        from St.Louis
        //addSequential(new CheckForHotGoal()); //Checks for hot goal
            //If hot goal is detected, the command ends
            //If hot goal is not detected, the command ends after a timeout.
        addSequential(new PrepareShootFar());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new DriveForward());
        addSequential(new RollersInThenStop(4));
        addSequential(new PivotStoredPosition());
        //addSequential(new DriveSpin());*/
        addSequential(new RetractLatch());
        addSequential(new CloseClaw());
        addSequential(new WaitCommand(0.5));
        addSequential(new CheckForHotGoal(2));
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotAutoClose(1));
        addSequential(new DriveForwardSpeed(1, 1, 1.25, false));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new DriveForwardSpeed(-0.5, -0.5, 0.3 , false));
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(3));
    }
}
