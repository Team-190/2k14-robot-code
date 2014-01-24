/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc190.CurrentRobotProject;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStationLCD;


/**
 *
 * @author Will
 */
public class MessageLogger {
    
    
    public void printUserMessage(String message){
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 0, message);
        DriverStationLCD.getInstance().updateLCD(); 
    }
    
    public void speakMessage(SpeechMessage message){

    }
    
}
