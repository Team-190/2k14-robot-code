//This commandgroup need to be reviewed

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Pass extends CommandGroup {
    
    public  Pass() {
        
        addParallel(new PivotDownPosition());
        addSequential(new RollersBackward());
        //wait until !passbuttonpressed;
        //addSequential(new RollersStop());
        
    }
}
