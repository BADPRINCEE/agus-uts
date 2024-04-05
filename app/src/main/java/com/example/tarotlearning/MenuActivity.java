package com.example.tarotlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button majorArcanaButton;
    private Button minorArcanaButton;
    private Button reversedButton;
    private Button aboutButton;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Inisialisasi elemen tampilan
        majorArcanaButton = findViewById(R.id.button1);
        minorArcanaButton = findViewById(R.id.button2);
        reversedButton = findViewById(R.id.button3);
        aboutButton = findViewById(R.id.button4);
        exitButton = findViewById(R.id.button6);

        // Mengatur listener klik untuk masing-masing tombol
        majorArcanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memanggil aktivitas SubMenuActivity untuk menu Major Arcana
                Intent intent = new Intent(MenuActivity.this, MajorActivity.class);
                intent.putExtra("menu", "Major Arcana");
                startActivity(intent);
            }
        });

        minorArcanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memanggil aktivitas SubMenuActivity untuk menu Minor Arcana
                Intent intent = new Intent(MenuActivity.this, MinorActivity.class);
                intent.putExtra("menu", "Minor Arcana");
                startActivity(intent);
            }
        });

        reversedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memanggil aktivitas SubMenuActivity untuk menu Reversed
                Intent intent = new Intent(MenuActivity.this, ReversedActivity.class);
                intent.putExtra("menu", "Reversed");
                startActivity(intent);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memanggil aktivitas SubMenuActivity untuk menu About
                Intent intent = new Intent(MenuActivity.this, AboutActivity.class);
                intent.putExtra("menu", "About");
                startActivity(intent);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menutup aplikasi
                finish();
            }
        });
    }
}
