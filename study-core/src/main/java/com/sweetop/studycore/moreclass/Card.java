package com.sweetop.studycore.moreclass;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/12
 * Time: 下午6:40
 * To change this template use File | Settings | File Templates.
 */
public class Card {
    private CardRank rank;
    private CardSuit suit;

    // Kinds of ranks

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public CardSuit getSuit() {
        return suit;
    }
}
