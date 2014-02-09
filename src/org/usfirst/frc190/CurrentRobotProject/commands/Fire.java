//This command manages the sequencing for the Shooter pistons
//the command assumes that all pistons are in correct position.

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Fire extends CommandGroup {
    
    public  Fire() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        
        addSequential(new OpenClaw());
        //TODO: Check reed switch for OpenClaw()
        addSequential(new ExtendLatch());
        addSequential(new WaitForExtended());
        addSequential(new RetractPiston2());
        addSequential(new RetractPiston1());
        addSequential(new WaitForRetracted());
        addSequential(new CloseClaw());
        //TODO: Check for claw reed switch.
        addSequential(new RetractLatch());
        //TODO: Check for latch retracted reed switch.
        addSequential(new ExtendPiston1());
        addSequential(new ExtendPiston2());
        addParallel(new PivotStoredPosition());
    }
}
