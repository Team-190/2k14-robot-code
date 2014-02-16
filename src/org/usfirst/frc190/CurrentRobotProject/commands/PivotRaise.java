//This command raises the pivot until the button is released or it hits 
//the upper limit switch
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class PivotRaise extends Command {
    
    double motorSpeed = 0.5;
    
    public PivotRaise() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.pivot.disable();
        Robot.collector.setRollerSpeed(0);
    }
    protected void execute() {
        Robot.pivot.setMotor(motorSpeed);
    }
    protected boolean isFinished() {
        return Robot.pivot.topLimitSwitchPressed();
    }
    protected void end() {
        Robot.pivot.setMotor(0);
    }
    protected void interrupted() {
        end();
    }
}
