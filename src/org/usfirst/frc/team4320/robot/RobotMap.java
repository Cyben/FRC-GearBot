package org.usfirst.frc.team4320.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Analog ports
	public static final int ANALOG_PRESSURE_SENSOR = 0;
	
////PCM 	
	// Gear catcher
	public static final int	CATCH_SOL_OPEN = 0;
	public static final int CATCH_SOL_CLOSE = 1;
					
	// Gear lifter
	public static final int LIFT_SOL_OPEN = 2;
	public static final int LIFT_SOL_CLOSE = 3;
	
		
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
