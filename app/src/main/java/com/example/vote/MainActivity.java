
package com.example.vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnsc, btnpr, btnlog, btntech, btnfine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsc = findViewById(R.id.sc);
        btnpr = findViewById(R.id.pr);
        btnlog = findViewById(R.id.log);
        btntech = findViewById(R.id.technical);
        btnfine = findViewById(R.id.finearts);


        btnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                opensc();

            }
        });

        btnpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                openpr();

            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                openlog();

            }
        });
        btntech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                opentech();

            }
        });
        btnfine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                openfine();

            }
        });
    }
    public void opensc()
    {
        Intent intent=new Intent(this, SC.class);
        startActivity(intent);
    }
    public void openpr()
    {
        Intent intent=new Intent(this, pr.class);
        startActivity(intent);
    }
    public void openlog()
    {
        Intent intent=new Intent(this,
                log.class);
        startActivity(intent);
    }
    public void opentech()
    {
        Intent intent=new Intent(this, tech.class);
        startActivity(intent);
    }  public void openfine()
    {
        Intent intent=new Intent(this, Fine.class);
        startActivity(intent);
    }

}