//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class OneBallAutoTeleop extends CommandGroup {
    
    public  OneBallAutoTeleop() {
        addSequential(new DriveForward(2.25));
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
    }
}
