//This is the Collect commandgroup
//It is used in both teleop and auto
//It first brings the arm into position, closes the claw, and starts the rollers
//Then when the ball is collected, it goes to the Up position
//I auto, the timeout method is called to prevent the robot from
//not getting mobility points

//NOTE: when you want the collect command to go to Stored when ended
//use the one with the boolean

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Collect extends CommandGroup {

    public Collect() {
        addSequential(new CloseClaw());
        addSequential(new PivotLower());
        addSequential(new RollersForward());
        addSequential(new WaitForCollection());
        addSequential(new RollersStop());
        addSequential(new PivotRaise());
    }
}
