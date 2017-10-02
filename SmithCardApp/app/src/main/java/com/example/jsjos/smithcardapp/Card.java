package com.example.jsjos.smithcardapp;

public class Card {
    private String cardAmountValue;
    private String cardSuitValue;

    Card(String numVal, String suitVal) {
        cardAmountValue = numVal;
        cardSuitValue = suitVal;
    }

    public String getCardSuitValue() {
        return cardSuitValue;
    }

    public void setCardSuitValue(String cardSuitValue) {
        this.cardSuitValue = cardSuitValue;
    }

    public String getCardAmountValue() {
        return cardAmountValue;
    }

    public void setCardAmountValue(String cardStringValue) {
        this.cardAmountValue = cardStringValue;
    }
}
