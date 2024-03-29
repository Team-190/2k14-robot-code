//This command looks for the hot goal and waits until
//it's detected or timed out.
package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;
//This command looks for uses the Banner sensor to look for the Hot Goal.
//You can also specify a timeout, after which this command will end no matter what.
//When called sequentially, this command will block until the hot goal is detected or until it is timed out.
public class CheckForHotGoal extends Command {
    private double timeout = 4.5; //Command will exit after this many seconds no matter what.
    public CheckForHotGoal() {
        setTimeout(4.5);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    public CheckForHotGoal(double time) {
        setTimeout(time);
    }
    protected void initialize() {
        
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return isTimedOut() || Robot.shooter.goalIsHot(); 
            //Command ends when the hot goal is seen, or isTimedOut().
            //Should not run in Teleop
    }
    protected void end() {
    }
    protected void interrupted() {
        end();
    }
}
