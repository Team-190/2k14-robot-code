package org.usfirst.frc190.CurrentRobotProject;

//This is an "enum-type" class that allows you specify how the robot should move in order to collect the ball. 

//Values 0-9 are resevered for passing control commands to the Arduino.
//Values 10-40 are reserved for pressure sensing. (Value is 10 = No lights, Value is 40 = All lights on strip on.
//Values 41+ are reserved for different LED light strip patterns.


public class ArduinoMessages {
    public final byte value;

    protected static final byte LEFT_VAL  = 0;

    public static final ArduinoMessages LEFT = new ArduinoMessages(LEFT_VAL);

    
    
    private ArduinoMessages(byte value){
        this.value = value;
    } 
}
