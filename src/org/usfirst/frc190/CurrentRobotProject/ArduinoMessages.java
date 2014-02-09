package org.usfirst.frc190.CurrentRobotProject;

//This is an "enum-type" class that allows you specify how the robot should move in order to collect the ball. 


public class ArduinoMessages {
    public final byte value;

    protected static final byte LEFT_VAL  = 0;

    public static final ArduinoMessages LEFT = new ArduinoMessages(LEFT_VAL);

    
    
    private ArduinoMessages(byte value){
        this.value = value;
    } 
}
