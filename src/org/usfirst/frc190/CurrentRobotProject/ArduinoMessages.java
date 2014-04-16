package org.usfirst.frc190.CurrentRobotProject;

//This is an "enum-type" class that allows you specify how the robot should move in order to collect the ball. 

//Values 0-9 are resevered for passing control commands to the Arduino.
//Values 10-40 are reserved for pressure sensing. (Value is 10 = No lights, Value is 40 = All lights on strip on.
//Values 41+ are reserved for different LED light strip patterns.


public class ArduinoMessages {
    public final byte value;

    protected static final byte DISABLED_VAL  = 0;
    protected static final byte ENABLED_VAL  = 1;
    protected static final byte COLLECTING_VAL  = 2;
    protected static final byte LOWERING_PIVOT_VAL  = 3;
    protected static final byte RAISING_PIVOT_VAL  = 4;
    protected static final byte ROLLERS_IN_VAL  = 5;
    protected static final byte ROLLERS_OUT_VAL  = 6;
    protected static final byte FIRE_VAL  = 7;
    protected static final byte BOOM_TRIPLE_THREAT_VAL  = 8;
    protected static final byte MOVING_TO_STORED_VAL  = 9;
    protected static final byte PREPARING_TO_SCORE_LOW_VAL  = 10;
    protected static final byte PREPARING_FOR_TRUSS_VAL  = 11;
    protected static final byte PREPARING_FOR_FAR_VAL  = 12;
    protected static final byte CLOSING_CLAW_VAL  = 13;
    protected static final byte OPENING_CLAW_VAL  = 14;

    public static final ArduinoMessages DISABLED = new ArduinoMessages(DISABLED_VAL);
    public static final ArduinoMessages ENABLED = new ArduinoMessages(ENABLED_VAL);
    public static final ArduinoMessages COLLECTING = new ArduinoMessages(COLLECTING_VAL);
    public static final ArduinoMessages LOWERING_PIVOT = new ArduinoMessages(LOWERING_PIVOT_VAL);
    public static final ArduinoMessages RAISING_PIVOT = new ArduinoMessages(RAISING_PIVOT_VAL);
    public static final ArduinoMessages ROLLERS_IN = new ArduinoMessages(ROLLERS_IN_VAL);
    public static final ArduinoMessages ROLLERS_OUT = new ArduinoMessages(ROLLERS_OUT_VAL);
    public static final ArduinoMessages FIRE = new ArduinoMessages(FIRE_VAL);
    public static final ArduinoMessages BOOM_TRIPLE_THREAT = new ArduinoMessages(BOOM_TRIPLE_THREAT_VAL);
    public static final ArduinoMessages MOVING_TO_STORED = new ArduinoMessages(MOVING_TO_STORED_VAL);
    public static final ArduinoMessages PREPARING_TO_SCORE_LOW = new ArduinoMessages(PREPARING_TO_SCORE_LOW_VAL);
    public static final ArduinoMessages PREPARING_FOR_TRUSS = new ArduinoMessages(PREPARING_FOR_TRUSS_VAL);
    public static final ArduinoMessages PREPARING_FOR_FAR = new ArduinoMessages(PREPARING_FOR_FAR_VAL);
    public static final ArduinoMessages CLOSING_CLAW = new ArduinoMessages(CLOSING_CLAW_VAL);
    public static final ArduinoMessages OPENING_CLAW = new ArduinoMessages(OPENING_CLAW_VAL);
    

    
    
    private ArduinoMessages(byte value){
        this.value = value;
    } 
}
