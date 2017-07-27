package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LiftGears extends Subsystem{
	
	private DoubleSolenoid liftSol;
	
	public static LiftGears instance;
	
	public static LiftGears getInstance(){
		if(instance == null)
			instance = new LiftGears();
		return instance;
	}
	private LiftGears(){
		liftSol = new DoubleSolenoid(RobotMap.LIFT_SOL_OPEN,RobotMap.LIFT_SOL_CLOSE);
		liftSol.set(DoubleSolenoid.Value.kForward);
	}
	
	public void changeSolState(boolean SolState){
		if(SolState)
			liftSol.set(DoubleSolenoid.Value.kForward);
		else
			liftSol.set(DoubleSolenoid.Value.kReverse);
	}
	public Value getSolState(){
		return liftSol.get();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
