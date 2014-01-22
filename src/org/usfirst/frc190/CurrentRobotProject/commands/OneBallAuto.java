// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc190.CurrentRobotProject.commands;
import org.usfirst.frc190.CurrentRobotProject.Robot;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc190.CurrentRobotProject.AutoDirection;

/**
 *
 */
public class OneBallAuto extends CommandGroup {
        
    public  OneBallAuto() {
        switch(Robot.getAutonomousDirection().value){
            case 0:
                //LEFT
                break;
            case 1:
                //RIGHT
                break;
            case 2:
                //FORWARD
                break;
            case 3:
                //NO MOVEMENT
                break;
                
        }
        
        
        addSequential(new ShootFar());
        //if(!Robot.camera.hotgoal()){
            //Timer.delay(5); 5 seconds
        //}
        addSequential(new Fire());
        addSequential(new DriveForward());
        addSequential(new DriveSpin());
        
        
        /*
        addSequential(new WaitCommand(.3));
        addSequential(new ExtendPiston1());
        addSequential(new WaitCommand(.2));
        addSequential(new PressurizePiston2());
        addSequential(new WaitCommand(.5));
        addSequential(new Fire());
        */
        //addParallel(new ArmDown());
        //addSequential(new DriveForward(5));
        //addSequential(new DriveSpin());
        
    }
}
