package com.example.kittichai.goodmorningandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.button_1);
        bt1.setOnClickListener(this);

        Button bt2 = (Button) findViewById(R.id.button_2);
        bt2.setOnClickListener(this);

        Button bt3 = (Button) findViewById(R.id.button_3);
        bt3.setOnClickListener(this);

        Button bt4 = (Button) findViewById(R.id.button_4);
        bt4.setOnClickListener(this);

        Button bt5 = (Button) findViewById(R.id.button_5);
        bt5.setOnClickListener(this);

        Button bt6 = (Button) findViewById(R.id.button_6);
        bt6.setOnClickListener(this);

        Button bt7 = (Button) findViewById(R.id.button_7);
        bt7.setOnClickListener(this);

        Button bt8 = (Button) findViewById(R.id.button_8);
        bt8.setOnClickListener(this);

        Button bt9 = (Button) findViewById(R.id.button_9);
        bt9.setOnClickListener(this);

        Button bt0 = (Button) findViewById(R.id.button_0);
        bt0.setOnClickListener(this);

        Button bt_clear = (Button) findViewById(R.id.clear_button);
        bt_clear.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //Toast t = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
        //t.show();
        TextView tv = (TextView) findViewById(R.id.digit_text_view);

        int id = v.getId();

        if (i != 6) {
            if (id == R.id.button_1) {
                tv.append("1");
                ++i;
            } else if (id == R.id.button_2) {
                tv.append("2");
                ++i;
            } else if (id == R.id.button_3) {
                tv.append("3");
                ++i;
            } else if (id == R.id.button_4) {
                tv.append("4");
                ++i;
            } else if (id == R.id.button_5) {
                tv.append("5");
                ++i;
            } else if (id == R.id.button_6) {
                tv.append("6");
                ++i;
            } else if (id == R.id.button_7) {
                tv.append("7");
                ++i;
            } else if (id == R.id.button_8) {
                tv.append("8");
                ++i;
            } else if (id == R.id.button_9) {
                tv.append("9");
                ++i;
            } else if (id == R.id.button_0) {
                tv.append("0");
                ++i;
            }
        }
        if (id == R.id.clear_button) {
            tv.setText("");
            i = 0;
        }

    }


}

