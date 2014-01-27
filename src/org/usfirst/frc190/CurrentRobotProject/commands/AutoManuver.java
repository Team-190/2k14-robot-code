//This commands need work

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;


public class AutoManuver extends CommandGroup {
    
    private double collectTimeout = 3; //Change later if nessecary.
    
    public  AutoManuver() {
        addSequential(new DriveForward(10, 1));
        addSequential(new DriveSpin(90, 0.5));
        addSequential(new Collect(collectTimeout));
        addSequential(new DriveSpin(-90, 0.5));
        addSequential(new DriveForward(-10, 1));
    }
}
