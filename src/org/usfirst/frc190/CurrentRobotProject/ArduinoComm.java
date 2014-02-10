
//This class handles sending messages to the robot's on-board Arduino via I2C.

package org.usfirst.frc190.CurrentRobotProject;
import edu.wpi.first.wpilibj.DigitalModule;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.visa.VisaException;
import edu.wpi.first.wpilibj.DigitalOutput;
/**
 *
 * @author Will
 */
public class ArduinoComm {
    
    I2C i2c = DigitalModule.getInstance(1).getI2C(168);
    private static byte[] toSend = new byte[1];
    
    public static void sendMessage(byte message){
        toSend[0] = message;
        DigitalModule.getInstance(1).getI2C(168).transaction(toSend, 1, null, 0);
        
    }
    
    public static void sendMessage(ArduinoMessages message){
        toSend[0] = message.value;
        DigitalModule.getInstance(1).getI2C(168).transaction(toSend, 1, null, 0);
    }

    
    
    
}
