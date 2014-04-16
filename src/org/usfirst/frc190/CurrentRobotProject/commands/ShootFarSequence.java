//This is the command group for the full Shoot Far sequence in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;

public class ShootFarSequence extends CommandGroup {
    
    public  ShootFarSequence() {
        Robot.I2CComm.sendMessage(ArduinoMessages.PREPARING_FOR_FAR);
        addSequential(new PrepareShootFar());
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
