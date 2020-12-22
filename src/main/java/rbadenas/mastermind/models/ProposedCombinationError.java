package rbadenas.mastermind.models;

public enum ProposedCombinationError {

	WRONG_LENGTH ("Wrong proposed combination length\n"),
	WRONG_COLOR ("Wrong colors they must be: " + Color.getAvailableColors() + "\n"),
	DUPLICATED_COLORS ("Wrong proposed combination, you shuldn't repeat color.\n"),
	NULL ("");

	private final String value;

    ProposedCombinationError(final String value) {
        this.value = value;
	}
	
	public boolean isNull(){
		return this == ProposedCombinationError.NULL;
	}

    @Override
    public String toString() {
        return value;
    }
}