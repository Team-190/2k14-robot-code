
//This class makes it easy to print messages to the driver station.

package org.usfirst.frc190.CurrentRobotProject;
import edu.wpi.first.wpilibj.DriverStationLCD;

public class MessageLogger {

    public void printUserMessage(String message) {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 0, message);
        DriverStationLCD.getInstance().updateLCD();
    }
}
