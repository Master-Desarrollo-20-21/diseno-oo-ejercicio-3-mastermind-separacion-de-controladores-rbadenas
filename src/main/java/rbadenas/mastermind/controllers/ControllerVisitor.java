package rbadenas.mastermind.controllers;

public interface ControllerVisitor {

    void visit(StartController controller);

    void visit(BoardController controller);

	void visit(ResumeController controller);
    
}