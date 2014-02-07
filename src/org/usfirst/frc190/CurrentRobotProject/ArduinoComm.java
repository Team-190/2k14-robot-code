
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
    
    private static SerialPort serial;
    static DigitalOutput out = new DigitalOutput(6);
    
    public static void sendSerialMessage(int message){
        out.pulse(0.0001*message);
    }
    
    public static void sendMessage(int message){
        DigitalModule.getInstance(1).getI2C(1).setCompatabilityMode(true);
        DigitalModule.getInstance(1).getI2C(1).write(4, message);
    }
    
    public static void sendMessage(ArduinoMessages message){
        DigitalModule.getInstance(1).getI2C(1).write(4, message.value);
    }

    public ArduinoComm() {
        try {
            this.serial = new SerialPort(9600);
        } catch (VisaException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
