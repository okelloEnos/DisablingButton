package com.okellosoftwarez.train;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TrainAdapter myAdapter;
    RecyclerView.LayoutManager myLayoutManager;
    public static String buttonString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);

        myLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myLayoutManager);

        myAdapter = new TrainAdapter(this,Application.trains);
        recyclerView.setAdapter(myAdapter);

        receiveButtonIntents();

    }

    private void receiveButtonIntents() {
        if (getIntent().hasExtra("button")){
            buttonString = getIntent().getStringExtra("button");
            sendIntents_details(buttonString);
            Toast.makeText(this, "Which Button2 : " + buttonString, Toast.LENGTH_LONG).show();
        }
    }

    private void sendIntents_details(String buttonString) {
        Intent intent = new Intent(MainActivity.this, TrainAdapter.class);
        intent.putExtra("button", buttonString);
    }
}
