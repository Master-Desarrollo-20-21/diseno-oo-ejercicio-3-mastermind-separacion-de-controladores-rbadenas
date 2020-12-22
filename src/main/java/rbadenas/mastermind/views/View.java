package rbadenas.mastermind.views;

import rbadenas.mastermind.controllers.Controller;
import rbadenas.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor{

	public void interact(Controller controller) {
        controller.accept(this);
	}

}