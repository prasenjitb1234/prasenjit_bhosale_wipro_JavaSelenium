package day_6_assignment.Enums;

//4.Card Suit & Rank

//Redesign a Card class using two enums: Suit (CLUBS, DIAMONDS, HEARTS, SPADES) and Rank (ACE…KING).
//Then implement a Deck class to:
//•	Create all 52 cards.
//•	Shuffle and print the order.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameDemo {

    // Enum for Suits
    enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    // Enum for Ranks
    enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    // Card class
    static class Card {
        private final Suit suit;
        private final Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }

    // Deck class
    static class Deck {
        private final List<Card> cards;

        public Deck() {
            cards = new ArrayList<>();
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards.add(new Card(suit, rank));
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(cards);
        }

        public void printDeck() {
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }

    
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Deck created with 52 cards.\n");

        System.out.println("Shuffling deck...\n");
        deck.shuffle();

        deck.printDeck();
    }
}
