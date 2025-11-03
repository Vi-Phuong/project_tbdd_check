package com.example.tuVung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.gheptu.GhepTuActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnGame;
    private ImageButton imbtnHome;
    private ImageButton imbtnHoc;
    private ImageButton imbtnCheckList;
    private ImageButton imbtnGame;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            btnGame = findViewById(R.id.btnGame);
            imbtnGame = findViewById(R.id.imbtnGame);
            View.OnClickListener gameClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentGhepTu = new Intent(MainActivity.this, GhepTuActivity.class);
                    startActivity(intentGhepTu);
                }
            };
        btnGame.setOnClickListener(gameClickListener);
        imbtnGame.setOnClickListener(gameClickListener);


            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}