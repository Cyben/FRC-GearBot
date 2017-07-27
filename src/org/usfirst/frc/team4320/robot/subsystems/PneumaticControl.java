package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PneumaticControl extends Subsystem{

	
	private Compressor compressor;
	private AnalogInput pressureSensor;
	private boolean compressorState;
	
	public static PneumaticControl instance;
	
	public static PneumaticControl getInstance(){
		if(instance == null)
			instance = new PneumaticControl();
		return instance;
	}
	
	private PneumaticControl(){
		compressor = new Compressor();
		pressureSensor = new AnalogInput(RobotMap.ANALOG_PRESSURE_SENSOR);
		compressorState = false;
	}
	
	public void setCompressorState(boolean State){
		compressor.setClosedLoopControl(compressorState);
		compressorState = State;
	}
	
	public boolean getCompressorState(){
		return compressorState;
	}
	
	public int getPressure() {
		return (pressureSensor.getValue() - 410) * 375 / 8192;
	}
	
	public void reportPressure(){
		SmartDashboard.putNumber("Pressure", getPressure());
	}
	
	@Override
	protected void initDefaultCommand(){
		// TODO Auto-generated method stub
		
	}
}
