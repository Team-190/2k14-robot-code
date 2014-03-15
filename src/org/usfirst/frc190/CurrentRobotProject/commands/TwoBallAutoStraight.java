//Runs the Two-Ball Sequence with movement commands designed to pick
//up the ball that is a few feet in front of the robot.

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class TwoBallAutoStraight extends CommandGroup {

    public TwoBallAutoStraight() {
        addSequential(new WaitCommand(1));
        //addSequential(new CheckForHotGoal(2.5));
        addSequential(new DriveForwardSpeed(1, 1, 0.5));
        addSequential(new DriveForwardSpeed(0.65, 0.65, 4.5));
            //DriveForwardTimeout(time, distance, speed)
        addSequential(new DriveForwardSpeed(-0.5, -0.6, 0.4));
            //DriveForwart(distance, speed)
        addSequential(new WaitCommand(0.75));
        addSequential(new PrepareShootTruss());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
