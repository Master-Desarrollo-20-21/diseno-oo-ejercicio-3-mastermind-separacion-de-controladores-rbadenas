package rbadenas.mastermind.controllers;

import rbadenas.mastermind.models.Game;
import rbadenas.mastermind.models.State;
import rbadenas.mastermind.models.Combination;
import rbadenas.mastermind.models.ProposedCombinationError;

import java.util.ArrayList;
import java.util.HashSet;

import rbadenas.mastermind.models.Attempt;
import rbadenas.mastermind.models.Color;

public class BoardController extends Controller {

    public BoardController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controller) {
        controller.visit(this);
    }

    public int getAttemptsCount() {
        return game.getAttemptsCount();
    }

    public ArrayList<Attempt> getAttempts() {
        return game.getAttempts();
    }

    public void addAttempt(String proposedString) {
        game.addAttempt(proposedString);
    }

    public String getHiddenSecret(){
        return game.getHiddenSecret();
    }
    
    public boolean isContinuePlaying() {
        return !this.game.isGameLost() && !this.game.isLastAttemptWinner();
    }

    public boolean isLastAttemptWinner() {
        return game.isLastAttemptWinner();
    }

    public ProposedCombinationError isValid(String proposedString){

        if(proposedString.length() != Combination.LENGTH) {
            return ProposedCombinationError.WRONG_LENGTH;
        }

        if (!this.isValidColor(proposedString)) {
            return ProposedCombinationError.WRONG_COLOR;
        }

        if (this.isRepeatedColor(proposedString)) {
            return ProposedCombinationError.DUPLICATED_COLORS;
        }
        return ProposedCombinationError.NULL;
    }

    private boolean isValidColor(String proposedString) {

        var proposedArray = proposedString.split("");
        for (String item : proposedArray) {
            if(!Color.getAvailableColors().contains(item)){
                return false;
            }
        }
		return true;
    }

    private boolean isRepeatedColor(String proposedString) {

        var chars = new HashSet<Character>();
        for (char c : proposedString.toCharArray()) {
            if (!chars.add(c)) return true;
        }
        return false;
    }

}