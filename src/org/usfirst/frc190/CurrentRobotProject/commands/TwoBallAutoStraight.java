//Runs the Two-Ball Sequence with movement commands designed to pick
//up the ball that is a few feet in front of the robot.

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallAutoStraight extends CommandGroup {

    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double ballDist = 10;         //distance from the robot to the ball
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double collectTimeout = 10;   //timeout for the collect command
    private final double finalSpinAngle = 180;  //angle for the final spin

    public TwoBallAutoStraight() {
        addSequential(new DriveDistance(32.0, 0.75));
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
        addSequential(new PivotDownPosition());
        addParallel(new CollectWithTimeout());
        addSequential(new DriveDistance(25.0, 0.75));
        addSequential(new DriveDistance(-20.0,0.75));
        addSequential(new PivotFarPosition());
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
