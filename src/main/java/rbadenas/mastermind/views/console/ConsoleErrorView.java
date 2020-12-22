package rbadenas.mastermind.views.console;

import rbadenas.utils.Console;
import rbadenas.mastermind.models.ProposedCombinationError;
import rbadenas.mastermind.views.ErrorView;

public class ConsoleErrorView extends ErrorView {

    ConsoleErrorView(ProposedCombinationError error) {
        super(error);
    }

    @Override
    public void show() {
        Console.getInstance().write(error.toString());
    }

}