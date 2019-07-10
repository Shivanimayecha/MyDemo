package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ans = (TextView)findViewById(R.id.txt_ans1);


        Intent intent = getIntent();
        String res = intent.getStringExtra("Result");
        //int value = getIntent().getIntExtra("Result",0);
        ans.setText(res);
    }
}
