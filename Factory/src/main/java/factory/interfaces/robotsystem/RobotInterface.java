package factory.interfaces.robotsystem;

import java.util.List;

import factory.interfaces.model.BoxInterface;
import factory.interfaces.model.TaskInterface;

public interface RobotInterface{

	/**
	 * @return the list of boxes the robot currently has in his storage
	 */
	List<BoxInterface> getBoxes();
	
	/**
	 * adds a box to the robot
	 * @param box
	 */
	void addBox(BoxInterface box);
	
	/**
	 * does the robot-specific work
	 */
	void doWork();
	
	/**
	 * @return true if the robot has finished its work and is ready again
	 */
	boolean isReady();
	
	/**
	 * notifies the monitoring system about the given event 
	 * @param task
	 * @param event
	 */
	void notifyMonitoringSystem(TaskInterface task, RobotEvent event);
	
}
