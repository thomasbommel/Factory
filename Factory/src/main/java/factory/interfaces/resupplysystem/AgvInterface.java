package factory.interfaces.resupplysystem;

import factory.interfaces.model.PositionInterface;
import factory.interfaces.model.TaskInterface;

public interface AgvInterface{

	void submitTask(TaskInterface task);
	
	TaskInterface getCurrentTask();
	
	PositionInterface getPosition();
	
	/**
	 * notifies the monitoring system about the given event 
	 * @param task
	 * @param event
	 */
	void notifyMonitoringSystem(TaskInterface task, AgvEvent event);
}
