//Runs the Two-Ball Sequence with movement commands designed to pick
//up the ball that is a few feet in front-left of the robot.

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallAutoLeft extends CommandGroup {
    
    private final double angle = 60;      //Angle from straigh forward
    private final double maxSpeed = 0.5;  //maximum speed of the motors
    private final double ballDist = 10;   //distance from the robot to the ball
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double collectTimeout = 10;   //timeout for the collect command
    private final double finalSpinAngle = 180;  //angle for the final spin
    
    public  TwoBallAutoLeft() {
        addSequential(new ShootFar());
        addSequential(new Fire());
        addParallel(new PivotDownPosition());
        addSequential(new DriveSpin(-angle, maxSpeed));
        addParallel(new Collect(collectTimeout));
        addSequential(new DriveForward(ballDist, maxSpeed));//TODO: Parameters may need to change.
        addParallel(new ShootFar());
        addSequential(new DriveForward(-ballDist, maxSpeed));//TODO: Parameters may need to change.
        addSequential(new DriveSpin(angle, maxSpeed));
        addSequential(new Fire());
        addSequential(new DriveForward(mobilityDist, maxSpeed)); //TODO: Parameters may need to change.
        addSequential(new DriveSpin(finalSpinAngle, maxSpeed)); //TODO: Parameters may need to change.
    }
}
