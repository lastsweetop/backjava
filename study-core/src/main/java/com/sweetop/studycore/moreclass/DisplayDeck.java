package com.sweetop.studycore.moreclass;

public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = 0; suit < CardSuit.values().length; suit++) {
            for (int rank = 0; rank < CardRank.values().length; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                        card.getRank(),
                        card.getSuit());
            }
        }


    }
}