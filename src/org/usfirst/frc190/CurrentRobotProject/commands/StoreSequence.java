//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class StoreSequence extends CommandGroup {
    
    public  StoreSequence() {
        
        Robot.I2CComm.sendMessage((byte) 9);
        addSequential(new CloseClaw());
        addSequential(new PivotStoredPosition());
    }
}
