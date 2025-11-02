package com.example.gheptu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tuVung.R;

public class VictoryActivity  extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
        Button btnPlayAgain = findViewById(R.id.btnPlayAgain);
        btnPlayAgain.setOnClickListener(v -> {
            startActivity(new Intent(VictoryActivity.this, GhepTuActivity.class));
            finish();

        });
    }


}
