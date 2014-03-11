//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class LowGoalShot extends CommandGroup {
    
    public  LowGoalShot() {
        addSequential(new PivotLowGoal());
        addSequential(new WaitForBoomButton());
        addSequential(new OpenClaw());
        addSequential(new WaitCommand(3));
        addSequential(new CloseClaw());
        addSequential(new PivotStoredPosition());
    }
}
