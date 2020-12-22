package rbadenas.mastermind.controllers;

import rbadenas.mastermind.models.Game;
import rbadenas.mastermind.models.State;


public class ResumeController extends Controller {

    ResumeController(Game game, State state) {
        super(game, state);
    }

    public void reset() {
        this.game.reset();
        this.state.reset();
    }

    @Override
    public void accept(ControllerVisitor controller) {
        controller.visit(this);
    }

}