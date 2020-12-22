package rbadenas.mastermind.views.console;

import rbadenas.mastermind.controllers.BoardController;
import rbadenas.mastermind.models.Attempt;
import rbadenas.mastermind.views.Message;
import rbadenas.utils.Console;

public class ConsoleBoardView {

	public void interact(BoardController controller) {

        do{
            Console.getInstance().write(controller.getAttemptsCount() + Message.ATTEMPT_CAPTION.getMessage());
            Console.getInstance().write(controller.getHiddenSecret());

            for (Attempt attempt : controller.getAttempts()) {
                Console.getInstance().write(attempt.toString());
            }

            controller.addAttempt(new ConsoleProposedCombinationView().interact(controller));

        }while(controller.isContinuePlaying());

        this.showGameResult(controller.isLastAttemptWinner());
        controller.next();
    }
    
    private void showGameResult(boolean isWinner){
        if (isWinner) {
            Console.getInstance().write(Message.WINNER.getMessage());
        } else {
            Console.getInstance().write(Message.LOOSER.getMessage());
        }
    }

}