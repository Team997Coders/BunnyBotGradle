package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 *
 */
public class ArraySelector extends CommandGroup {
   
	public ArraySelector(boolean input) {
    	
    	if(input) {
    		addSequential(new ArrayUp()); 
    		//System.out.println("in ArraySelector increment to " + Robot.armJoint.selector);
    	} else { 
    		addSequential(new ArrayDown());	
    	}
    	
    	addSequential(new ArmToArrayAngle());
    }
}
