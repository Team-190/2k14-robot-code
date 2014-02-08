//This command just does driving for mobility
//for cases when we can't collect and/or fire

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMobilityOnly extends CommandGroup {
    
    private final double maxSpeed = 0.5;        //maximum speed of the motors
    private final double mobilityDist = 10;     //distance from starting position to colored zone
    private final double finalSpinAngle = 180;  //angle for the final spin
    
    public  AutoMobilityOnly() {
        addSequential(new DriveForward(mobilityDist, maxSpeed));
        addSequential(new DriveSpin(finalSpinAngle, maxSpeed));
    }
}
