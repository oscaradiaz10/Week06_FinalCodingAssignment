package Week06_FinalProject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//Create List of Cards
	private List<Card> cards;
	
	//Create constructor with 52 cards and 4 suits
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				cards.add(new Card(i + 2, names[i] + " of " + suit));
			}
		}
	}
	
	//Create the Shuffle Method
	public void shuffle() {
		Collections.shuffle(cards); //Import collection
	}
	
	//Create the draw method
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
} 
