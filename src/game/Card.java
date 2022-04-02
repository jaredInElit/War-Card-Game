package game;

public class Card {

//  Card Fields
  private final String value;
  private final String suit;
  private final int number;

//  Card Constructor including setters
  public Card(String value, String suit, int number) {
      this.value = value;
      this.suit = suit;
      this.number = number;
  }

//  Card Getters
  public String getSuit() {
      return suit;
  }

  public String getValue() {
      return value;
  }

  public int getNumber() {
      return number;
  }

  
//  Card Methods
  public String describe() {
      return getValue() + " of " + getSuit();
  }
}