package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.commands.ClawButtonCommand;

/**
 *
 */
public class AutonomousClawThing extends CommandGroup {
	//FIX THIS LATER

    public AutonomousClawThing() {
    	addSequential (new ClawButtonCommand(Robot.claw.openState));
        addSequential (new DriveToDistance(30));
        addSequential (new ClawButtonCommand(Robot.claw.closeState));
        //Lift claw plz :^)
      
        
        
        //requires(Robot.claw); //uncomment these
    }
}
