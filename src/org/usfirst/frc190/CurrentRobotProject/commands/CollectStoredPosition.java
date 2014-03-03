//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CollectStoredPosition extends CommandGroup {
    
    public  CollectStoredPosition() {
        addSequential(new CloseClaw());
        addSequential(new RollersForward());
        addSequential(new PivotStoredPosition());
        addSequential(new WaitForCollection());
        addSequential(new RollersStop());
    }
}
