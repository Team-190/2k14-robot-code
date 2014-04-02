//This is the Collect commandgroup
//It is used in both teleop and auto
//It first brings the arm into position, closes the claw, and starts the rollers
//Then when the ball is collected, it goes to the Up position
//I auto, the timeout method is called to prevent the robot from
//not getting mobility points

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class Collect extends CommandGroup {

    public Collect() {
        Robot.I2CComm.sendMessage((byte) 2);
        addSequential(new CloseClaw());
        addSequential(new RollersForward());
        addSequential(new PivotDownPosition());
        addSequential(new WaitForCollection());
        addSequential(new RollersStop());
        addSequential(new PivotStoredPosition());
    }
}
