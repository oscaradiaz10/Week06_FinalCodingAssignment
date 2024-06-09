package Week06_FinalProject;

public class App {
	public static void main(String[] args) {
        // Instantiate deck and players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();

        //Deal the cards to both players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Play the game
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            if (card1 != null && card2 != null) {
                System.out.print(player1.getName() + " plays ");
                card1.describe();
                System.out.print(player2.getName() + " plays ");
                card2.describe();
                
                if (card1.getValue() > card2.getValue()) {
                    player1.incrementScore();
                    System.out.println(player1.getName() + " wins this round.");
                } else if (card2.getValue() > card1.getValue()) {
                    player2.incrementScore();
                    System.out.println(player2.getName() + " wins this round.");
                } else {
                    System.out.println("Tie - No points awarded");
                }
                
                System.out.println("Scores: " + player1.getName() + " - " + player1.getScore() + " | " + player2.getName() + " - " + player2.getScore());
                System.out.println();
            }
        }

        //Determine the winner for each draw
        System.out.println("Final Scores: " + player1.getName() + " - " + player1.getScore() + " | " + player2.getName() + " - " + player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}
