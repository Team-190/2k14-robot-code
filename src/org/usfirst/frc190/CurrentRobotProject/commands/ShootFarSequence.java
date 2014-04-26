//This is the command group for the full Shoot Far sequence in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;

public class ShootFarSequence extends CommandGroup {
    
    public  ShootFarSequence() {
        Robot.I2CComm.sendMessage(ArduinoMessages.PREPARING_FOR_FAR);
        addSequential(new PrepareShootFar());
        addSequential(new WaitForBoomButton());
        addSequential(new WaitForBoomRelease());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire(true));
        addSequential(new WaitForBoomRelease());
        addSequential(new WaitToFire(false));
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
    }
}
