//

package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class LowGoalShot extends CommandGroup {
    
    public  LowGoalShot() {
        Robot.I2CComm.sendMessage(ArduinoMessages.PREPARING_TO_SCORE_LOW);
        addSequential(new PivotLowGoal());
        addSequential(new WaitForBoomButton());
        addSequential(new OpenClaw());
        //addSequential(new WaitCommand(3));
        //addSequential(new CloseClaw());
        //addSequential(new PivotStoredPosition());
    }
}
