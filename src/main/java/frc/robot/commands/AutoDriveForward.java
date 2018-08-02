package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;

/**
 *
 */
public class AutoDriveForward extends CommandGroup {

    public AutoDriveForward() {
    	addSequential(new DriveToDistance(RobotMap.Values.autoDriveDistance));
    	//Makes the robot travel thirty feet to cross half of the arena (and then some).
    }
}
