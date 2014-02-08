//This command sets both of the pistons to be ready to fire
//and puts the pivot in the far position

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootFar extends CommandGroup {

    public ShootFar() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        
        addParallel(new PivotFarPosition());
        addParallel(new ExtendPiston1());
        addSequential(new PressurizePiston2());
    }
}
