package rbadenas.mastermind.views;

import rbadenas.mastermind.models.ProposedCombinationError;

public abstract class ErrorView {

    protected ProposedCombinationError error;

    protected ErrorView(ProposedCombinationError error) {
        this.error = error;
    }

    public abstract void show();

}