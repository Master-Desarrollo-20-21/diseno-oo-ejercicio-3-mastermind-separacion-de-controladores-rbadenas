package rbadenas.mastermind.views;

public enum Message {
    
    START_TITLE("----- MASTERMIND -----\n"),
    ATTEMPT_CAPTION(" attemp(s)"),
	COMBINATION_ENTER("Propose a combination: "),
    WINNER("You've won!!!\n"),
    LOOSER("You've lost\n"),
	RESUME("Resume? (y/n): ");
	
	private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
	}

}

