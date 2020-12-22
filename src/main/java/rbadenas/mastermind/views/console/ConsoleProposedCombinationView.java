package rbadenas.mastermind.views.console;

import rbadenas.mastermind.controllers.BoardController;
import rbadenas.mastermind.models.ProposedCombinationError;
import rbadenas.mastermind.views.Message;
import rbadenas.utils.Console;

public class ConsoleProposedCombinationView {

    public String interact(BoardController controller)
    {
        String proposedString;
        ProposedCombinationError error;
		do {
            proposedString = Console.getInstance().read(Message.COMBINATION_ENTER.getMessage());
            error = controller.isValid(proposedString);
            new ConsoleErrorView(error).show();
        }while(!error.isNull());
        
        return proposedString;
    }
}