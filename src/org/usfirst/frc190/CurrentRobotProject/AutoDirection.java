package org.usfirst.frc190.CurrentRobotProject;

//This is an "enum-type" class that allows you specify how the robot should move in order to collect the ball. 

public class AutoDirection {
    public final int value;

    protected static final int LEFT_VAL = 0;
    protected static final int RIGHT_VAL = 1;
    protected static final int FORWARD_VAL = 2;
    protected static final int NO_MOVEMENT_VAL = 3; 

    public static final AutoDirection LEFT = new AutoDirection(LEFT_VAL);
    public static final AutoDirection RIGHT = new AutoDirection(RIGHT_VAL);
    public static final AutoDirection FORWARD = new AutoDirection(FORWARD_VAL);
    public static final AutoDirection NO_MOVEMENT = new AutoDirection(NO_MOVEMENT_VAL);

    private AutoDirection(int value){
        this.value = value;
    } 
}
