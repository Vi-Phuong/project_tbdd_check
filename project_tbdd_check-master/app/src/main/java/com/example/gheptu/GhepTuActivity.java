package com.example.gheptu;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tuVung.MainActivity;
import com.example.tuVung.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



// activ cua trang ghep tu
public class GhepTuActivity extends AppCompatActivity {
    private TextView tvTimer;
    private GridLayout gridLayout;
    private HashMap<String, String> pairs;
    private List<String> allWords;
    private MaterialCardView firstCard = null;
    private String firstValue = "";

    private Handler handler = new Handler();
    private ImageButton imbtnHome;
    private ImageButton imbtnHoc;
    private ImageButton imbtnCheckList;
    private ImageButton imbtnGame;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trang_gheptu);
        gridLayout = findViewById(R.id.gridLayout);
        tvTimer = findViewById(R.id.tvTimer);
        imbtnHoc = findViewById(R.id.imbtnHoc);
        imbtnCheckList = findViewById(R.id.imbtnCheckList);
        imbtnGame = findViewById(R.id.imbtnGame);
        imbtnHome = findViewById(R.id.imbtnHome);

        imbtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGame = new Intent(GhepTuActivity.this, MainActivity.class);
                startActivity(intentGame);
            }


        });
        setupDuLieu();
        setupKhung();


    }

    private void setupDuLieu() {
        pairs = new HashMap<>();
        pairs.put("Sheep", "Con cừu");
        pairs.put("Horse", "Con ngựa");
        pairs.put("Fox", "Con cáo");
        pairs.put("Dolphin", "Cá heo");
        pairs.put("Octopus", "Bạch tuộc");
        pairs.put("Shark", "Cá mập");

        allWords = new ArrayList<>();
        allWords.addAll(pairs.keySet());     // English
        allWords.addAll(pairs.values());     // Vietnamese
        Collections.shuffle(allWords);
    }

    private void setupKhung() {
        gridLayout.removeAllViews();

        for (String word : allWords) {
            View itemView = getLayoutInflater().inflate(R.layout.item_card, gridLayout, false);
            TextView txtWord = itemView.findViewById(R.id.txtWord);
            txtWord.setText(word);

            // Chia đều các cột
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = 0;
            params.height = GridLayout.LayoutParams.WRAP_CONTENT;
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
            itemView.setLayoutParams(params);

            MaterialCardView card = (MaterialCardView) itemView;


            gridLayout.addView(itemView);
        }
    }





}
