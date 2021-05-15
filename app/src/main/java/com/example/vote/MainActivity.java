
package com.example.vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsc= findViewById(R.id.sc);
        btnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensc();
            }
        });

    }
    public void opensc()
    {
        Intent intent=new Intent(this, SC.class);
        startActivity(intent);
    }
}