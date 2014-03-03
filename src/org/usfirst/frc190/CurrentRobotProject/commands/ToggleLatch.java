//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class ToggleLatch extends Command {
    
    boolean run = false;
    
    public ToggleLatch(boolean shouldCheck) {
        run = shouldCheck;
        requires(Robot.shooter);
    }
    public ToggleLatch() {
        requires(Robot.shooter);
    }
    
    
    protected void initialize() {
        if (run) {
            if (Robot.oi.autonomoustoManualControls.get()) {
                Robot.shooter.toggleLatchPosition();
            }
        } else {
            Robot.shooter.toggleLatchPosition();
        }
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
    }
    protected void interrupted() {
        end();
    }
}
