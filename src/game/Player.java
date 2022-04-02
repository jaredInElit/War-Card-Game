package game;
import java.util.ArrayList;
import java.util.List;

public final class Player {
    
//  Player Fields
  private List<Card> hand = new ArrayList<Card>();
  int score;
  String name;

//  Player Constructor
  public Player(String name) {
        this.name = name;
        score = 0;
  }

    
//  Player Getters
  public String getCardSuit() {
        return hand.get(0).getSuit();
    }

  public String getCardValue() {
        return hand.get(0).getValue();
    }

  
  //  Player Methods
  
  public void describe() {
        for (Card x : hand) {
            System.out.println(this.name + " " + x);
        }
    }

  public void draw(Deck deck) {
        hand.add(0, deck.draw());
    }


  public Card flip() {
        return hand.remove(0);
    }
}