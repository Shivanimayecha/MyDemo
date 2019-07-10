package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText no1, no2;
    Button add, sub, mul, div;
    TextView txtResult;
    String res;


    int num1 = 0;
    int num2 = 0;
    int result = 0;
    String TAG = "TAG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();

    }
    private void findViews() {


        no1 = (EditText) findViewById(R.id.edt_no1);
        no2 = (EditText) findViewById(R.id.edt_no2);

        add = (Button) findViewById(R.id.btn_Add);
        sub = (Button) findViewById(R.id.btn_Sub);
        mul = (Button) findViewById(R.id.btn_Mul);
        div = (Button) findViewById(R.id.btn_Div);

        txtResult = (TextView) findViewById(R.id.txt_ans1);
    }


    private void initViews() {

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

       //  res = String.valueOf(result);

        if (view == add) {

            num1 = Integer.parseInt(no1.getText().toString());
            num2 = Integer.parseInt(no2.getText().toString());

            result = num1 + num2;

            Log.e(TAG, "onClick: " + result);
            res = String.valueOf(result);
            //txtResult.setText(res);

            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra("Result",res);
            startActivity(intent);

        }
        else if (view == sub)
        {
            num1 = Integer.parseInt(no1.getText().toString());
            num2 = Integer.parseInt(no2.getText().toString());

            result = num1 - num2;

            Log.e(TAG, "onClick: " + result);
            res = String.valueOf(result);
            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra("Result",res);
            startActivity(intent);

        /*    String res = String.valueOf(result);
            txtResult.setText(res);*/
        }

        else if (view == mul)
        {
            num1 = Integer.parseInt(no1.getText().toString());
            num2 = Integer.parseInt(no2.getText().toString());

            result = num1 * num2;

            Log.e(TAG, "onClick: " + result);
            res = String.valueOf(result);
            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra("Result",res);
            startActivity(intent);

       /*     String res = String.valueOf(result);
            txtResult.setText(res);*/
        }
        else if (view == div)
        {
            num1 = Integer.parseInt(no1.getText().toString());
            num2 = Integer.parseInt(no2.getText().toString());

            result = num1 / num2;

            Log.e(TAG, "onClick: " + result);
            res = String.valueOf(result);
            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra("Result",res);
            startActivity(intent);

           /* String res = String.valueOf(result);
            txtResult.setText(res);*/
        }
/*
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                switch (view.getId()) {
                    case R.id.btn_Add:

                        int num1 = 0;
                        int num2 = 0;
                        int result = 0;

                        num1 = Integer.parseInt(no1.getText().toString());
                        num2 = Integer.parseInt(no2.getText().toString());

                        result = num1 + num2;
                        txtResult.setText(result);
                        break;

                    case R.id.btn_Sub:


                        result = num1 - num2;
                        txtResult.setText(result);
                        break;

                    case R.id.btn_Mul:


                        result = num1 * num2;
                        txtResult.setText(result);
                        break;

                    case R.id.btn_Div:


                        result = num1 / num2;
                        txtResult.setText(result);
                        break;

                    default:
                        break;
                }


            }
        });
*/

    }
}
