package com.example.NhiemVu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

import com.example.tuVung.MainActivity;
import com.example.tuVung.R;

public class NhiemVuActivity extends AppCompatActivity {
    private ImageButton imbtnHome;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trang_nhiemvuhoctap);
        imbtnHome = findViewById(R.id.imbtnHome);
        imbtnHome.setOnClickListener(v -> {
            startActivity(new Intent(NhiemVuActivity.this, MainActivity.class));
            finish();

        });


    }
}
