//This command needs to be double checked


package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootTruss extends CommandGroup {

    public ShootTruss() {
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.

        //addParallel(new ArmTruss());
        addSequential(new DepressurizePiston2());
        //Aimed = true, Allows Fire command to run;
    }
}