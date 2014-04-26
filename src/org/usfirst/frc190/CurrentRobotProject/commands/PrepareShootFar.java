//This command sets both of the pistons to be ready to fire
//and puts the pivot in the far position

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class PrepareShootFar extends CommandGroup {

    public PrepareShootFar() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        addSequential(new RollersStop());
        //addSequential(new WaitForRetracted());
        addSequential(new RetractLatch());
        addSequential(new WaitCommand(0.15));
        addSequential(new ExtendPiston1());
        addSequential(new ExtendPiston2());
        addSequential(new PivotFarPosition());
    }
}
