//This is the Commandgroup for Two Ball Auto

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TwoBallAuto extends CommandGroup {

    public TwoBallAuto() {

        addSequential(new ShootFar());
        addSequential(new Fire());
        addSequential(new ShootFar());
        //addSequential(new AutoManuver()); //Will perform any nessecary manuvers.
        addSequential(new Fire());
        addSequential(new DriveForward(5, 0.6)); //TODO: Parameters may need to change.
        addSequential(new DriveSpin(180, 0.6)); //TODO: Parameters may need to change.
            
        //What we should do is do the proceedure assuming it works, and just at
        //the end of the time, we drive forward to get the mobility points
        // and if we fire before that, we then spin around
    }
}
