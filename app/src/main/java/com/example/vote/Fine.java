package com.example.vote;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Fine extends AppCompatActivity {
    RadioGroup rg;
    RadioButton btnst1;
    RadioButton btnst2;

    TextView st1;
    TextView st2;
    int count=0;
    int count1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c);
        rg=(RadioGroup)findViewById(R.id.rg);

        st1 = findViewById(R.id.st1count);

        st2 = findViewById(R.id.st2count);
        rg=findViewById(R.id.rg);
        btnst1 = findViewById(R.id.btnst1);
        btnst2 = findViewById(R.id.btnst2);

        btnst1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                int selectedid=rg.getCheckedRadioButtonId();
                btnst1=(RadioButton)findViewById(selectedid);
                btnst2=(RadioButton)findViewById(selectedid);

                btnst1();


            }

            public void btnst1() {
                count++;
                st1.setText(Integer.toString(count)); }

        });
        btnst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnst2();
            }
            public void btnst2() {
                count1++;
                st2.setText(Integer.toString(count1)); }

        });
        if(btnst1.isSelected()||btnst2.isSelected())
        {
            btnst1.setText("");

        }





    }
};
