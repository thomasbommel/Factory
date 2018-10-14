package factory.interfaces.resupplysystem;

import factory.interfaces.model.PositionInterface;
import factory.interfaces.model.TaskHandlerInterface;
import factory.interfaces.model.TaskInterface;

public interface AgvMoveMaterialTaskInterface extends TaskInterface {

	TaskHandlerInterface getTaskHandler();
	PositionInterface getFromPosition();
	PositionInterface getToPosition();
	
	
	
}
