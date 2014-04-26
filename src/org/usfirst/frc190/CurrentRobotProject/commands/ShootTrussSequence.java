//This is the command group for the full Shoot Truss sequence in Teleop

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;

public class ShootTrussSequence extends CommandGroup {
    
    public  ShootTrussSequence() {
        Robot.I2CComm.sendMessage(ArduinoMessages.PREPARING_FOR_TRUSS);
        addSequential(new PrepareShootTruss());
        addSequential(new WaitForBoomButton());
        addSequential(new WaitForBoomRelease());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire(true));
        addSequential(new WaitForBoomRelease());
        addSequential(new WaitToFire(false));
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());
        addSequential(new RollersInThenStop(3));
        /*addSequential(new ExtendLatch());
        addSequential(new WaitForExtended(0.4));    
        addSequential(new RetractPiston2());
        addSequential(new RetractPiston1());
        addSequential(new CloseClaw());
        addSequential(new PivotStoredPosition());*/
        /*addParallel(new WaitCommand(1));
        addParallel(new PivotStoredPosition());
        addParallel(new RollersInThenStop(3));
        addSequential(new Fire());*/
        
    }
}