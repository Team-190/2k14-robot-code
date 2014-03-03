//This command prepares the robot to shoot a truss shot

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class PrepareShootTruss extends CommandGroup {

    public PrepareShootTruss() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        addSequential(new RollersStop());
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotTrussPosition());
        
    }
}