package rbadenas.mastermind;

import rbadenas.mastermind.views.View;
import rbadenas.mastermind.controllers.Logic;

public abstract class Mastermind {

	private Logic logic;
	private View view;

	protected Mastermind(){
		this.logic = new Logic();
		this.view = this.createView();
	}

	protected abstract View createView();

	protected void play(){
		do {
            this.view.interact(this.logic.getController());
        } while (!this.logic.isExit());
	}
}