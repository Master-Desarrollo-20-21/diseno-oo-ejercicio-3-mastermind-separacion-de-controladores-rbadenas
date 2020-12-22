package rbadenas.mastermind.controllers;

import rbadenas.mastermind.models.Game;
import rbadenas.mastermind.models.State;

public class ExitController extends Controller {


    public ExitController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {

    }
}