package rbadenas.mastermind.controllers;

import rbadenas.mastermind.models.Game;
import rbadenas.mastermind.models.State;

public abstract class Controller {

    protected Game game;
    protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }


    public void next() {
        this.state.next();
    }

    public abstract void accept(ControllerVisitor controller);

}