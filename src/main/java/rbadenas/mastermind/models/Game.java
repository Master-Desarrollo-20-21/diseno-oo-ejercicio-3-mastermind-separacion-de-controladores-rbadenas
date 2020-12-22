package rbadenas.mastermind.models;

import java.util.ArrayList;


public class Game {

    private ArrayList<Attempt> attempts;
	private SecretCombination secretCombination;
    private final int NUM_ATTEMPS = 10;
    
    public Game() {
        reset();
    }
    
    public void reset(){
        secretCombination = new SecretCombination();
        attempts = new ArrayList<Attempt>();
    }

    public void addAttempt(String proposedString){
        var attempt =  new Attempt(new ProposedCombination(proposedString), this.secretCombination);
        attempts.add(attempt);
    }

	public boolean isGameLost() {
		return attempts.size() >= NUM_ATTEMPS;
	}

    public int getAttemptsCount(){
        return attempts.size();
    }

    public Attempt getAttempt(int index){
        return attempts.get(index);
    }

    public ArrayList<Attempt> getAttempts(){
        return attempts;
    }

    public boolean isLastAttemptWinner(){
        return getAttempt(this.getAttemptsCount() - 1).isWinner();
    }

    public String getHiddenSecret(){
        return secretCombination.toString();
    }
}