package rbadenas.mastermind;

import rbadenas.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected GraphicsView createView() {
		return new GraphicsView();
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}