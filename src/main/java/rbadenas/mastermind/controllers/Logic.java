package rbadenas.mastermind.controllers;

import rbadenas.mastermind.models.Game;
import rbadenas.mastermind.models.State;
import rbadenas.mastermind.models.StateValue;

import java.util.Map;

public class Logic {

    private final Game game;
    private final State state;
    private final Map<StateValue, Controller> controllers;
    
    public Logic() {
        this.state = new State();
        this.game = new Game();

        this.controllers = Map.of(
                StateValue.INITIAL, new StartController(this.game, this.state),
                StateValue.IN_GAME, new BoardController(this.game, this.state),
                StateValue.RESUME, new ResumeController(this.game, this.state),
                StateValue.EXIT, new ExitController(this.game, this.state)
        );
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }

	public boolean isExit() {
		return this.state.isExit();
	}

}