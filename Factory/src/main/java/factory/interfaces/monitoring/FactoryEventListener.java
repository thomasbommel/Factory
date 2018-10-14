package factory.interfaces.monitoring;

import factory.interfaces.conveyorsystem.ConveyorEvent;
import factory.interfaces.model.TaskInterface;
import factory.interfaces.resupplysystem.AgvEvent;
import factory.interfaces.robotsystem.RobotEvent;
import factory.interfaces.warehousesystem.WarehouseEvent;

public interface FactoryEventListener {

	void notify(TaskInterface task, WarehouseEvent warehouseEvent);
	
	void notify(TaskInterface task, AgvEvent agvEvent);
	
	void notify(TaskInterface task, ConveyorEvent conveyorEvent);
	
	void notify(TaskInterface task, RobotEvent robotEvent);
	
}
