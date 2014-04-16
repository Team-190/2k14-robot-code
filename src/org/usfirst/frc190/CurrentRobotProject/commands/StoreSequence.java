//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;

public class StoreSequence extends CommandGroup {
    
    public  StoreSequence() {
        
        Robot.I2CComm.sendMessage(ArduinoMessages.MOVING_TO_STORED);
        addSequential(new CloseClaw());
        addSequential(new PivotStoredPosition());
    }
}
