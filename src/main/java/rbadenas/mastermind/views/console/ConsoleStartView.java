package rbadenas.mastermind.views.console;

import rbadenas.utils.Console;
import rbadenas.mastermind.controllers.StartController;
import rbadenas.mastermind.views.Message;

public class ConsoleStartView {

        public void interact(StartController controller) {
                Console.getInstance().write(Message.START_TITLE.getMessage());
                controller.next();
	}
}