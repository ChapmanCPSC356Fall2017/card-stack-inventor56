package com.example.jsjos.smithcardapp;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Collections;
import java.util.Stack;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private TextView topLeftTextView;
    private ImageView topLeftImageView;
    private ImageView middleImageView;
    private ImageView bottomRightImageView;
    private TextView bottomRightTextView;
    private RelativeLayout layoutView;


    Stack<Card> cardStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative); // Load in the Relative Layout as the desired layout for execution

        // Set the different views
        this.topLeftTextView = (TextView) findViewById(R.id.topLeftCardValueID);
        this.topLeftImageView = (ImageView) findViewById(R.id.topLeftIconID);
        this.middleImageView = (ImageView) findViewById(R.id.centerIconID);
        this.bottomRightImageView = (ImageView) findViewById(R.id.bottomRightIconID);
        this.bottomRightTextView = (TextView) findViewById(R.id.bottomRightCardValueID);
        // Set the relative layout for view click
        this.layoutView = (RelativeLayout) findViewById(R.id.relativeLayout);


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

        // Shuffle the card stack
        Collections.shuffle(cardStack);

        layoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!cardStack.empty()) {
                    // Set the card for easy access via method
                    Card tempCard = cardStack.pop();

                    // Set and find the image resource for the Suit image
                    int imageResource = getResources().getIdentifier(tempCard.getCardSuitValue(), null, getPackageName());
                    //Set the drawable to pass into the setImageDrawable method below
                    Drawable dr = ResourcesCompat.getDrawable(getResources(), imageResource, null);

                    //Set screen values
                    topLeftTextView.setText(tempCard.getCardAmountValue());
                    topLeftImageView.setImageDrawable(dr);
                    middleImageView.setImageDrawable(dr);
                    bottomRightImageView.setImageDrawable(dr);
                    bottomRightTextView.setText(tempCard.getCardAmountValue());
                }


            }
        });




    }
}
