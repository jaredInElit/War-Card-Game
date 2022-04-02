package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

//     Creates List of Cards
    private List<Card> cards = new ArrayList<Card>();

//    Deck Constructor
    public Deck() {

        List<String> cardValue = List.of("2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
        
        for (int i = 0; i < cardValue.size(); i++) {
            String value = cardValue.get(i);
            
            List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
            
            int number = i + 2;
            
            for (String suit : suits) {
                cards.add(new Card(value, suit, number));
            }
        }
        
        
        
    }

//    Deck Methods
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);

    }




}