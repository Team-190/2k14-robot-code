//
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class ToggleLatch extends Command {
    public boolean isManual;
    public ToggleLatch() {
        requires(Robot.shooter);
        isManual = false;
    }
    public ToggleLatch(boolean run) {
        requires(Robot.shooter);
        isManual = true;
    }

    protected void initialize() {
        if(Robot.oi.manualSwitch.get()||!isManual){
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
