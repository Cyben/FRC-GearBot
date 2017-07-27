package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CatchGears extends Subsystem{

	private DoubleSolenoid catchSol;
	
	public static CatchGears instance;
	
	public static CatchGears getInstance(){
		if(instance == null)
			instance = new CatchGears();
		return instance;
	}
	private CatchGears(){
		catchSol = new DoubleSolenoid(RobotMap.CATCH_SOL_OPEN,RobotMap.CATCH_SOL_CLOSE);	
		catchSol.set(DoubleSolenoid.Value.kForward);
	}
	
	public void changeSolState(boolean SolState){
		if(SolState)
			catchSol.set(DoubleSolenoid.Value.kForward);
		else
			catchSol.set(DoubleSolenoid.Value.kReverse);
	}
	public Value getSolState(){
		return catchSol.get();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
