//This command turns on the collector motors
//If a value is passed in for the time the collector
//will stop when its hit with the limitswitch or the timeout stops
//Otherwise the motors stay on forward until the command is interrupted
package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc190.CurrentRobotProject.Robot;

public class WaitForCollection extends Command {

    private double speed = .5;    //roller speed. test value of .5 
    private double timeout = -1;  //-1 means no timeout.
    boolean timedOut = false;

    public WaitForCollection(double collectionTimeout) {
        timeout = collectionTimeout;

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collector);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    public WaitForCollection() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collector);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
        if (timeout >= 0) {
            setTimeout(timeout);
        }
        Robot.collector.setRollerSpeed(speed);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        if (timeout >= 0) {
            timedOut = isTimedOut();
        }

        return (Robot.collector.isCollected() || timedOut);
        //Wait for the ball to hit the limit switch 
        //or for the command to timeout.
    }

    protected void end() {
        Robot.collector.stop();
    }

    protected void interrupted() {
        end();
    }
}
