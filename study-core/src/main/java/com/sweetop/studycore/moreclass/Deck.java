package com.sweetop.studycore.moreclass;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/12
 * Time: 下午6:40
 * To change this template use File | Settings | File Templates.
 */
public class Deck {
    public static int numSuits = CardSuit.values().length;
    public static int numRanks = CardRank.values().length;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];

        for (int suit = 0; suit < numSuits; suit++) {
            for (int rank = 0; rank < numRanks; rank++) {
                cards[suit][rank] = new Card(CardRank.values()[rank], CardSuit.values()[suit]);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}
