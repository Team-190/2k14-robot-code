//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AdvancedTeleopShot extends CommandGroup {
    
    public  AdvancedTeleopShot() {
        //addSequential(new LimitDriveSpeed(0.5));
        //addSequential(new WaitForBannersensor());
        addSequential(new DriveForward());
        addSequential(new PrepareShootFar());
        addSequential(new Fire());
    }
}
