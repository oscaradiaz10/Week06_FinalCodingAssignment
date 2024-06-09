package Week06_FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand; //Import list
	private int score = 0;
	private String name;
	
	//Create Player constructor
	public Player (String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
	//Create describe method
	public void describe () {
		System.out.println(name + " has the following cards:");
		for (Card card : hand) {
			card.describe();
		}
	}	
	
	/*
	 * Methods for the game
	 */
	
	//Create the flip method
    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }

    //Create the draw method
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    //Create the increment score method
    public void incrementScore() {
        score++;
    }

    //Getter methods
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
