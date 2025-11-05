package com.example.LuyenPA;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tuVung.MainActivity;
import com.example.tuVung.R;

public class LuyenPhatAmActivity extends AppCompatActivity {
    private ImageView imvTroVe;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trang_luyenphatam);
        imvTroVe = findViewById(R.id.imvTroVe);
        imvTroVe.setOnClickListener(v -> {
            startActivity(new Intent   (LuyenPhatAmActivity.this, MainActivity.class));
            finish();

        });


    }
}
