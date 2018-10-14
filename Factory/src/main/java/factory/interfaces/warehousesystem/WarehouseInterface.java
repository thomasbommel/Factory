package factory.interfaces.warehousesystem;

import java.util.List;

import factory.interfaces.model.MaterialInterface;
import factory.interfaces.model.TaskInterface;

public interface WarehouseInterface{

	int getAmount(MaterialInterface material);
	
	/**
	 * @param material
	 * @return the created Task
	 */
	TaskInterface prepareMaterial(MaterialInterface material, int availablePreparationTime);
	
	/**
	 * notifies the monitoring system about the given event 
	 * @param task
	 * @param event
	 */
	void notifyMonitoringSystem(TaskInterface task, WarehouseEvent event);
	
	//TODO change type
	List<String> getTransactions();
}
