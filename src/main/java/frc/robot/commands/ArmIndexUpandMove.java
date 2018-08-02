package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

/**
 *
 */
public class ArmIndexUpandMove extends CommandGroup {

    public ArmIndexUpandMove() {
    	System.out.println("Select and Move");
    	//addSequential(new ArmToAngle(Robot.armJoint.movelist[Robot.armJoint.selector]));
    }
}
