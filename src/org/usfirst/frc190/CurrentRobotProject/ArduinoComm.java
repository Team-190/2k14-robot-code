
//This class handles sending messages to the robot's on-board Arduino via I2C.

package org.usfirst.frc190.CurrentRobotProject;
import edu.wpi.first.wpilibj.DigitalModule;
import edu.wpi.first.wpilibj.I2C;
/**
 *
 * @author Will
 */
public class ArduinoComm {
    
    private final byte[] toSend = new byte[1];
    private static ArduinoComm instance = null;
    
    private ArduinoComm() {
    }
    
    public static ArduinoComm getInstance() {
        if (instance == null) {
            instance = new ArduinoComm();
        }
        return instance;
    }
    
    public static void sendMessage(ArduinoMessages message){
        I2C i2c = DigitalModule.getInstance(1).getI2C(168);
        byte[] toSend = new byte[1];
        toSend[0] = message.value;
        i2c.transaction(toSend, 1, null, 0);
        //toSend[0] = message;
        //i2c.transaction(toSend, 1, null, 0);
    }
}
