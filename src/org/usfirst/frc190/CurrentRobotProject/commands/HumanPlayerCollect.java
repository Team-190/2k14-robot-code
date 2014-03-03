//






package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class HumanPlayerCollect extends CommandGroup {
    
    public  HumanPlayerCollect() {
        addSequential(new CloseClaw());
        addSequential(new RollersForward());
        addSequential(new PivotFarPosition());
        addSequential(new WaitForCollection());
        addSequential(new RollersStop());
        addSequential(new PivotStoredPosition());
    }
}
