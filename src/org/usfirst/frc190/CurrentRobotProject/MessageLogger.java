package org.usfirst.frc190.CurrentRobotProject;

import edu.wpi.first.wpilibj.DriverStationLCD;

public class MessageLogger {

    public void printUserMessage(String message) {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 0, message);
        DriverStationLCD.getInstance().updateLCD();
    }

    public void speakMessage(SpeechMessage message) {
        switch (message.value) {
            case SpeechMessage.LEFT_VAL:
                //TODO add code later.
                break;
        }

    }
}
