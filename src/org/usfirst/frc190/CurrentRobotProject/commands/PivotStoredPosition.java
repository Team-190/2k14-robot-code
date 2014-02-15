//This command set the setpoint for the stored position
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class PivotStoredPosition extends Command {
    
    private double degrees = 90;
    
    public PivotStoredPosition() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.pivot);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
        Robot.pivot.enable();
        Robot.pivot.setSetpoint(1.0);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INITIALIZE
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return Robot.pivot.onTarget() || Robot.pivot.lowerLimitSwitchPressed() || Robot.pivot.topLimitSwitchPressed();
    }
    protected void end() {
        if (Robot.pivot.lowerLimitSwitchPressed() || Robot.pivot.topLimitSwitchPressed()) {
            Robot.pivot.disable();
        }
    }
    protected void interrupted() {
        Robot.pivot.disable();
    }
}
