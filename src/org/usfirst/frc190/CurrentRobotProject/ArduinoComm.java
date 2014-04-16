
//This class handles sending messages to the robot's on-board Arduino via I2C.

package org.usfirst.frc190.CurrentRobotProject;
import edu.wpi.first.wpilibj.DigitalModule;
import edu.wpi.first.wpilibj.I2C;
/**
 *
 * @author Will
 */
public class ArduinoComm {
    
    protected I2C i2c;
    private final byte[] toSend = new byte[1];
    private static ArduinoComm instance = null;
    
    private ArduinoComm() {
        i2c = DigitalModule.getInstance(1).getI2C(168);
    }
    
    public static ArduinoComm getInstance() {
        if (instance == null) {
            instance = new ArduinoComm();
        }
        return instance;
    }
    
    public static void sendMessage(byte message){
        Robot.I2CComm.sendMessage(message);
        //toSend[0] = message;
        //i2c.transaction(toSend, 1, null, 0);
    }
}
