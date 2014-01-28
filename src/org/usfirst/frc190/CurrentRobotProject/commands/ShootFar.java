//This command needs to be double checked

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootFar extends CommandGroup {

    public ShootFar() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        
        //addParallel(new ArmFar());
        //Aimed = true, allow Fire command to run
    }
}
