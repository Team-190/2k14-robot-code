//Runs the Two-Ball Sequence with movement commands designed to pick
//up the ball that is a few feet in front-right of the robot.

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallAutoRight extends CommandGroup {

    private final double angle = 60;            //Angle from straigh forward
    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double ballDist = 10;         //distance from the robot to the ball
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double collectTimeout = 10;   //timeout for the collect command
    private final double finalSpinAngle = 180;  //angle for the final spin

    public TwoBallAutoRight() {
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
        addParallel(new PivotDownPosition());
        addSequential(new DriveSpin());
        addParallel(new CollectWithTimeout());
        addSequential(new DriveForward());
        addParallel(new PrepareShootFar());
        addSequential(new DriveForward());
        addSequential(new DriveSpin());
        addSequential(new Fire());
        addSequential(new DriveForward());
        addSequential(new DriveSpin());
    }
}
