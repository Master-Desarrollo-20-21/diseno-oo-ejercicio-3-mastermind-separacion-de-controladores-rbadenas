package rbadenas.mastermind.views.console;

import rbadenas.utils.Console;
import rbadenas.mastermind.controllers.ResumeController;
import rbadenas.mastermind.views.Message;

public class ConsoleResumeView {

    public ConsoleResumeView(){
        
    }
	public boolean interact(ResumeController controller) {
        boolean isResumed = Console.getInstance().read(Message.RESUME.getMessage()).equals("y");

        if (isResumed) {
            controller.reset();
        } else {
            controller.next();
        }
        return isResumed;
    }
    
}
