//Runs the Two-Ball Sequence with movement commands designed to pick
//up the ball that directly in front of the robot.

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallAutoNoMovement extends CommandGroup {

    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double collectTimeout = 10;   //timeout for the collect command
    private final double finalSpinAngle = 180;  //angle for the final spin

    public TwoBallAutoNoMovement() {
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
        addSequential(new CollectWithTimeout());
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
        addSequential(new DriveForward()); //TODO: Parameters may need to change.
        //addSequential(new DriveSpin()); //TODO: Parameters may need to change.
    }
}
