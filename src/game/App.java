package game;
public class App {

    public static void main(String[] args) {

        
//    Instantiates Deck
      Deck deck = new Deck();
        
//    Create Players  
      Player draws = new Player("Draws");
      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");
      
      
      deck.shuffle();
               
//    Splits Cards
      for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
      }
    
//    runs through deck
      for (int i = 0; i < 26; i++) {
            System.out.print(player1.name + " Card: " + player1.getCardValue() + " of " + player1.getCardSuit());
            int score1 = player1.flip().getNumber();
            System.out.print(" VS ");
            System.out.print(player2.name + " Card: " + player2.getCardValue() + " of " + player2.getCardSuit());
            int score2 = player2.flip().getNumber();

            
//          Determines winner
            if (score1 > score2) {
                player1.score++;
//          Prints Winner
                System.out.println("\n" + player1.name + " wins!");
            } else if (score2 > score1) {
                player2.score++;
                System.out.println("\n" + player2.name + " wins!");

            } else {
                System.out.println("\n" + "Draw!");
                 draws.score++;
            }
      }

//    Prints final winner and total scores
      if (player1.score > player2.score) {
            System.out.println(player1.name + " wins with a score of: " + player1.score + " VS " + player2.score);
      } else if (player1.score < player2.score) {
            System.out.println(player2.name + " wins with a score of: " + player2.score + " VS " + player1.score);
      } else {
            System.out.println(player1.name + " ties with " + player2.name + " both with a score of " + player1.score);
      }


    }
}