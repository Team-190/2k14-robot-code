//This is the command group for the full Shoot Truss sequence in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class ShootTrussSequence extends CommandGroup {
    
    public  ShootTrussSequence() {
        Robot.I2CComm.sendMessage((byte) 11);
        addSequential(new PrepareShootTruss());
        //addSequential(new WaitForPressure());
        addSequential(new WaitForBoomButton());
        addSequential(new WaitForBoomRelease());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(3));
    }
}