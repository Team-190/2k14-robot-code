//This command extends Piston 2
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
public class  ExtendPiston2 extends Command {
    public boolean isManual;
    public ExtendPiston2() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        isManual = false;
    }
    public ExtendPiston2(boolean run) {
        requires(Robot.shooter);
        isManual = true;
    }
    protected void initialize() {
        if(Robot.oi.manualSwitch.get()||!isManual){
            Robot.shooter.extend2();
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
