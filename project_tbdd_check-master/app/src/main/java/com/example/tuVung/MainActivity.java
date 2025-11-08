package com.example.tuVung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.LuyenPA.LuyenPhatAmActivity;

import com.example.gheptu.GhepTuActivity;


//Cac trang se lien ket voi Mainactivity (trang chu) bang intent o day
public class MainActivity extends AppCompatActivity {
    private Button btnGame;
    private ImageButton imbtnHome;
    private ImageButton imbtnHoc;
    private ImageButton imbtnCheckList;
    private ImageButton imbtnGame;
    private TextView tvluyenphatam;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Lien ket trang tro choi ghep tu
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            btnGame = findViewById(R.id.btnGame);
            imbtnGame = findViewById(R.id.imbtnGame);
            imbtnHoc = findViewById(R.id.imbtnHoc);
            tvluyenphatam = findViewById(R.id.tvluyenphatam);
            View.OnClickListener gameClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentGhepTu = new Intent(MainActivity.this, GhepTuActivity.class);
                    startActivity(intentGhepTu);
                }
            };
        btnGame.setOnClickListener(gameClickListener);
        imbtnGame.setOnClickListener(gameClickListener);

        // Lien ket trang Phat am
        tvluyenphatam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentLuyenPA = new Intent(MainActivity.this, LuyenPhatAmActivity.class);
                    startActivity(intentLuyenPA);
                }
            });




        // Lien ket trang chu de tu vung
            // .....


        // Liên ket trang nhiem vu hoc tap
            // .......

        // Lien ket trang tien do hoc tap
            // .....

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}