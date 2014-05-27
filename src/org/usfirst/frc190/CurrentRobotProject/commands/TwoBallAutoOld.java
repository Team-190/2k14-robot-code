//


package org.usfirst.frc190.CurrentRobotProject.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class TwoBallAutoOld extends CommandGroup {
    
    public  TwoBallAutoOld() {
        /*//addSequential(new WaitCommand(1));
        //addSequential(new CheckForHotGoal(2.5));
        addSequential(new DriveForward(1, 1, 0.5, false));
        addSequential(new DriveForward(0.5, 0.5, 2.5, false));
        addSequential(new WaitCommand(0.5));
        addSequential(new DriveForward(-0.5, -0.5, 0.15, false));
        addSequential(new PrepareShootTruss());
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new PivotStoredPosition());*/
        
        addSequential(new RetractLatch());
        addSequential(new CloseClaw());
        addSequential(new WaitCommand(0.5));
        addSequential(new ExtendPiston1());
        addSequential(new RetractPiston2());
        addSequential(new PivotAutoClose(1));
        addSequential(new DriveForward(1, 1, .95, false));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        addSequential(new DriveForward(-1, -1, 0.5 , false));
        addSequential(new DriveSpin(180));
        //addSequential(new RetractLatch());
        //addSequential(new ExtendPiston1());
        //addSequential(new RetractPiston2());
        addSequential(new PivotDownPosition());
        addSequential(new RollersForward());
        //addSequential(new RetractPiston2());
        addParallel(new Collect());
        addSequential(new DriveForward(1, 1, 1, false));
        addSequential(new DriveForward(-1, -1, 0.5 , false));
        addSequential(new PivotAutoClose(1));
        addSequential(new RetractLatch());
        addSequential(new ExtendPiston1());
        addSequential(new RollersStop());
        addSequential(new DriveSpin (180));
        addSequential(new DriveForward(1, 1, 0.9, false));
        addSequential(new DriveForward(-1, -1, 0.5 , false));
        addSequential(new OpenClaw());
        addSequential(new WaitToFire());
        addSequential(new Fire());
        
        
    }
}
