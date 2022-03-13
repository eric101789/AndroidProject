package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tx;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = findViewById(R.id.textView);
        bt = findViewById(R.id.button);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        tx.setTextColor(Color.BLUE);
    }


//private View.OnClickListener myClickListener = new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        tx.setTextColor(Color.BLUE);
//    }
//};


//    public void onButtonClick(View view) {
//        tx.setTextColor(Color.BLUE);
//    }
}