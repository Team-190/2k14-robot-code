//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class StoreSequence extends CommandGroup {
    
    public  StoreSequence() {
        addSequential(new CloseClaw());
        addSequential(new LimitDriveSpeed(1));
        addSequential(new PivotStoredPosition());
    }
}
