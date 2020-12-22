package rbadenas.mastermind;

import rbadenas.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected ConsoleView createView() {
		return new ConsoleView();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}