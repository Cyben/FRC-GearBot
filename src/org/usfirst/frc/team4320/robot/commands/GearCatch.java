package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class GearCatch extends InstantCommand{
	
	public GearCatch(){
		requires(Robot.catchGears);
	}
		// Called just before this Command runs the first time
		@Override
		protected void initialize() {
		}

		// Called repeatedly when this Command is scheduled to run
		@Override
		protected void execute() {
			if(Robot.catchGears.getSolState() == Value.kForward)
				Robot.catchGears.changeSolState(false);
			else
				Robot.catchGears.changeSolState(true);
		}
}
