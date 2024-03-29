//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;
public class  RollersOutThenStop extends Command {
    public boolean isManual;
    public RollersOutThenStop() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collector);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        isManual = false;
    }
    public RollersOutThenStop(boolean run) {
        requires(Robot.collector);
        isManual = true;
    }
    protected void initialize() {
        if(Robot.oi.manualSwitch.get()||!isManual){
        Robot.I2CComm.sendMessage(ArduinoMessages.ROLLERS_OUT);
        Robot.collector.setRollerSpeed(-1);
        }
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        Robot.collector.setRollerSpeed(0);
    }
    protected void interrupted() {
        end();
    }
}
