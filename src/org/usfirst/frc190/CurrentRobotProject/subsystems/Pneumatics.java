//Pneunatics Subsystem
//Baiscally contains just the compressor
package org.usfirst.frc190.CurrentRobotProject.subsystems;
import org.usfirst.frc190.CurrentRobotProject.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc190.CurrentRobotProject.ArduinoComm;

public class Pneumatics extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    AnalogChannel pressureSensor = RobotMap.pneumaticsPressureSensor;
    Compressor compressor = RobotMap.pneumaticsCompressor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    ArduinoComm arduinoComm = ArduinoComm.getInstance();
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
    public void startCompressor() {
        compressor.start();
    }
    
    public boolean isPressurized(){
        return 3.60 <= pressureSensor.getVoltage();
    }
    
    public void writePressure() {
        SmartDashboard.putNumber("Pressure", pressureSensor.getVoltage());
//        arduinoComm.sendMessage((byte) (pressureSensor.getVoltage() * 8.333));
    }
}
