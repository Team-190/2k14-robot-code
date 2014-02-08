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
        addParallel(new PivotDownPosition());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection());
        addParallel(new RollersStop());
    }

    public Collect(double timeout) {
        //This command works the same as expected, except it will end the 
        //WaitForCollection command after a given time.
        //This should only need to be called for autonomous.

        addParallel(new PivotDownPosition());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection(timeout));
        addSequential(new RollersStop());
    }
    
    public Collect(double timeout, boolean setToStoredPosition) {
        //This command works the same as expected, except it will end the 
        //WaitForCollection command after a given time.
        //This should only need to be called for autonomous.

        addParallel(new PivotDownPosition());
        addParallel(new RollersForward());
        addSequential(new CloseClaw());
        addSequential(new WaitForCollection(timeout));
        addParallel(new RollersStop());
        addSequential(new PivotStoredPosition());
    }
    
    
}
