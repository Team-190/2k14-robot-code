//This command manages the sequencing for the Shooter pistons
//the command assumes that all pistons are in correct position.

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class Fire extends CommandGroup {
    
    public  Fire() {
        Robot.I2CComm.sendMessage(ArduinoMessages.FIRE);
        setInterruptible(false);
        //None of the sequences for the pneumatics system need addParallel.
        //The commands take so little time there is no need.
        
        //addSequential(new OpenClaw());
        //addSequential(new WaitToFire());
        addSequential(new ExtendLatch());
        addSequential(new WaitForExtended(1));
        addSequential(new RetractPiston2());
        addSequential(new RetractPiston1());
        addSequential(new WaitForRetracted(1));
        addSequential(new CloseClaw());
        addSequential(new RetractLatch());
        addSequential(new WaitCommand(0.25));
        addSequential(new ExtendPiston1());
        Robot.I2CComm.sendMessage(ArduinoMessages.BOOM_TRIPLE_THREAT);
        //addSequential(new ExtendPiston2());
    }
}
