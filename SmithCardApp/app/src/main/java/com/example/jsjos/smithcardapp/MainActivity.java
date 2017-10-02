package com.example.jsjos.smithcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack<Card> cardStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative); // Load in the Relative Layout as the desired layout for execution

        // Create card values in stack;
        for (Suit s : Suit.values()) {
            cardStack.push(new Card("A", s.getString()));
            for (int i = 2; i <= 10; i++) {
                cardStack.push(new Card(String.valueOf(i), Suit.SPADE.getString()));
            }
            cardStack.push(new Card("J", s.getString()));
            cardStack.push(new Card("Q", s.getString()));
            cardStack.push(new Card("K", s.getString()));
        }
    }
}
