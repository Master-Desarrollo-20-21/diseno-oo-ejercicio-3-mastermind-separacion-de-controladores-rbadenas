package rbadenas.mastermind.views.console;

import rbadenas.mastermind.controllers.BoardController;
import rbadenas.mastermind.controllers.ResumeController;
import rbadenas.mastermind.controllers.StartController;
import rbadenas.mastermind.views.View;

public class ConsoleView extends View {

	private ConsoleStartView startView;
	private ConsoleBoardView boardView;
	private ConsoleResumeView resumeView;

	public ConsoleView() {
		this.startView = new ConsoleStartView();
		this.boardView = new ConsoleBoardView();
		this.resumeView = new ConsoleResumeView();
	}

	@Override
	public void visit(StartController controller) {
		this.startView.interact(controller);
	}

	@Override
	public void visit(BoardController controller) {
		this.boardView.interact(controller);
	}
	
	@Override
	public void visit(ResumeController controller) {
		this.resumeView.interact(controller);
	}

}