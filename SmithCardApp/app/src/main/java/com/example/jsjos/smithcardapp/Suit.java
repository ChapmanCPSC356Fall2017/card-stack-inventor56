package com.example.jsjos.smithcardapp;

/**
 * Created by jsjos on 10/1/2017.
 */

public enum Suit {
    HEART("@drawable/drawable_heart"),
    SPADE("@drawable/drawable_spade"),
    DIAMOND("@drawable/drawable_diamond"),
    CLUB("@drawable/drawable_club");

    private final String name;

    private Suit(String s) {
        name = s;
    }

    public String getString() {
        return name;
    }
}
