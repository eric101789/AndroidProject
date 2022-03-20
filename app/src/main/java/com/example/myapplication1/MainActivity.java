package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
//    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraintlayout);

//        tx = findViewById(R.id.textView);
//        bt = findViewById(R.id.button);

//        bt.setOnClickListener(this);
//        tx.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        switch(view.getId()) {
//            case R.id.textView:
//                tx.setTextColor(Color.RED);
//                tx.setText("Hello World!");
//                break;
//            case R.id.button:
//                tx.setTextColor(Color.BLUE);
//                tx.setText("點我、點我");
//        }
//        //tx.setTextColor(Color.BLUE);
//    }


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