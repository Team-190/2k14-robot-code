package org.usfirst.frc190.CurrentRobotProject;

//This is an "enum-type" class that allows you specify how the robot should move in order to collect the ball. 


public class SpeechMessage {
    public final int value;

    protected static final int LEFT_VAL = 0;

    public static final SpeechMessage LEFT = new SpeechMessage(LEFT_VAL);

    private SpeechMessage(int value){
        this.value = value;
    } 
}
