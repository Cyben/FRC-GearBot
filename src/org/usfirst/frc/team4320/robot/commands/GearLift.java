package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class GearLift extends InstantCommand{
	
	public GearLift(){
		requires(Robot.liftGears);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(Robot.liftGears.getSolState() == Value.kForward)
			Robot.liftGears.changeSolState(false);
		else
			Robot.liftGears.changeSolState(true);
	}
}
