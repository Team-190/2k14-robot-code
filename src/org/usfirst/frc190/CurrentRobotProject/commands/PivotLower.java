//This command lowers the pivot until the button is released or the lower
//limitswitch is released
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import org.usfirst.frc190.CurrentRobotProject.ArduinoMessages;
public class  PivotLower extends Command {
    
    double motorSpeed = 0.8;
    
    public PivotLower() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    
    public PivotLower(double time){
        setTimeout(time);
    }
    
    protected void initialize() {
        Robot.I2CComm.sendMessage(ArduinoMessages.LOWERING_PIVOT);
        Robot.pivot.disable();
    }
    protected void execute() {
        Robot.pivot.setMotor(-motorSpeed);
    }
    protected boolean isFinished() {
        return Robot.pivot.lowerLimitSwitchPressed()||isTimedOut();
    }
    protected void end() {
        Robot.pivot.setMotor(0);
    }
    protected void interrupted() {
        end();
    }
}
