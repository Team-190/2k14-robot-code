//

package org.usfirst.frc190.CurrentRobotProject.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
public class ThreeBallAuto extends CommandGroup {

    public ThreeBallAuto() {
        addSequential(new RetractLatch());
        addSequential(new CloseClaw());
        addSequential(new WaitCommand(0.5));
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotAutoClose(1));
        addSequential(new DriveForward(1, 1, 0.75, false));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new DriveForward(-1, -1, 0.25 , false));
        addSequential(new DriveSpin ());
        addSequential(new RetractLatch());
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotDownPosition());
        addSequential(new RollersForward());
        addParallel(new Collect());
        addSequential(new DriveForward(1, 1, 0.75, false));
        addSequential(new DriveForward(-1, -1, 0.25 , false));
        addSequential(new PivotAutoClose(1));
        addSequential(new RollersStop());
        addSequential(new DriveSpin ());
        addSequential(new DriveForward(1, 1, 0.75, false));
        addSequential(new DriveForward(-1, -1, 0.25 , false));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new DriveForward(-1, -1, 0.25 , false));
        addSequential(new DriveSpin ());
        addSequential(new RetractLatch());
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotDownPosition());
        addSequential(new RollersForward());
        addParallel(new Collect());
        addSequential(new DriveForward(1, 1, 0.75, false));
        addSequential(new DriveForward(-1, -1, 0.25 , false));
        addSequential(new PivotAutoClose(1));
        addSequential(new RollersStop());
        addSequential(new DriveSpin ());
        addSequential(new DriveForward(1, 1, 0.75, false));
        addSequential(new DriveForward(-1, -1, 0.25 , false));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
    }
}