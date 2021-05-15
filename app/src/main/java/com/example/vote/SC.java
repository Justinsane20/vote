package com.example.vote;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SC extends AppCompatActivity {

    Button btnst1;
    Button btnst2;

    TextView st1;
    TextView st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c);

        st1 = findViewById(R.id.btnst1);

        st2 = findViewById(R.id.btnst2);


        btnst1 = findViewById(R.id.btnst1);
        btnst2 = findViewById(R.id.btnst2);
    }


    public void btnst1(View v){
        String st1count = btnst1.getText().toString().trim();
        int count = Integer.parseInt(st1count);
        count++;
        st1.setText(String.valueOf(count));
    }

    public void btnst2(View v){
        String st2count = btnst2.getText().toString().trim();
        int count = Integer.parseInt(st2count);
        count++;
        st2.setText(String.valueOf(count));
    }

}