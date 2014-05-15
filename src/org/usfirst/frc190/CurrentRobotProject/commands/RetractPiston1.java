//This command retracts Piston 1
//I know, pretty crazy right?
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class RetractPiston1 extends Command {
    public boolean isManual;
    public RetractPiston1() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        isManual = false;
    }
    public RetractPiston1(boolean run) {
        requires(Robot.shooter);
        isManual = true;
    }
    protected void initialize() {
        if(Robot.oi.manualSwitch.get()||!isManual){
        Robot.shooter.retract1();
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
