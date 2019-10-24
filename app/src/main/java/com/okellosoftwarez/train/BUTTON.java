package com.okellosoftwarez.train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BUTTON extends AppCompatActivity {

    private static final String TAG = "BUTTON";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "on create started");
        setContentView(R.layout.activity_button);
        Button buyer, seller;
        buyer = findViewById(R.id.button);
        seller = findViewById(R.id.button2);

        buyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "buyer Button");
                Intent buyerIntent = new Intent(BUTTON.this, MainActivity.class);
                buyerIntent.putExtra("button", "buyer");
                startActivity(buyerIntent);
            }
        });

        seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "seller Button");
                Intent sellerIntent = new Intent(BUTTON.this, MainActivity.class);
                sellerIntent.putExtra("button", "seller");
                startActivity(sellerIntent);
            }
        });
    }
}
