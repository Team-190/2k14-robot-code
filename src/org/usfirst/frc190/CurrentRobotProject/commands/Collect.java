//This is the Collect commandgroup
//It is used in both teleop and auto
//It first brings the arm into position, closes the claw, and starts the rollers
//Then when the ball is collected, it goes to the Up position
//I auto, the timeout method is called to prevent the robot from
//not getting mobility points

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Collect extends CommandGroup {

    public Collect() {
        addParallel(new ArmDown());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection());
        addSequential(new ArmUp());
    }

    public Collect(double timeout) {
        //This command works the same as expected, except it will end the 
        //WaitForCollection command after a given time.
        //This should only need to be called for autonomous.

        addParallel(new ArmDown());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection(timeout));
        //Does not finish until limit switch is hit.
        addSequential(new ArmUp());
    }
}
