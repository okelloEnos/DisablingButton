package com.okellosoftwarez.train;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DETAIL extends AppCompatActivity {
    TextView tvName, tvPhone, tvMail;
    Button postBtn;
    private static final String TAG = "DETAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getIncomingIntent();

    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("name") && getIntent().hasExtra("phone")
                && getIntent().hasExtra("mail") && getIntent().hasExtra("button")) {

            Log.d(TAG, "getIncomingIntent: ");
            String name = getIntent().getStringExtra("name");
            String phone = getIntent().getStringExtra("phone");
            String mail = getIntent().getStringExtra("mail");
            String post = getIntent().getStringExtra("button");

//            Toast.makeText(this, "Button :" + post, Toast.LENGTH_LONG).show();


            setImage(name, phone, mail, post);
//            receiveBtnIntent();

        }
    }

//    private void receiveBtnIntent() {
//        if (getIntent().hasExtra("button")){
//            String post = getIntent().getStringExtra("button");
//
//            Toast.makeText(this, "Which Button :" + post, Toast.LENGTH_LONG).show();
//        }
//        else {
//            Toast.makeText(this, "NO Button SELECTED :" , Toast.LENGTH_LONG).show();
//        }
//    }

    private void setImage(String name, String phone, String mail, String post) {

        tvName = findViewById(R.id.textView3);
        tvPhone = findViewById(R.id.textView4);
        tvMail = findViewById(R.id.textView5);
        postBtn = findViewById(R.id.button3);

        tvName.setText(name);
        tvPhone.setText(phone);
        tvMail.setText(mail);

        if (post.equals("seller")){
            postBtn.setVisibility(View.VISIBLE);
        }
        else {
            postBtn.setVisibility(View.GONE);
        }
    }
}