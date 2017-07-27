package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ToggleCompressor extends InstantCommand{

	public ToggleCompressor(){
		requires(Robot.pneumaticControl);
	}

	@Override
	protected void execute() {
		if(Robot.pneumaticControl.getCompressorState())
			Robot.pneumaticControl.setCompressorState(false);
		else
			Robot.pneumaticControl.setCompressorState(true);
	}
	
}