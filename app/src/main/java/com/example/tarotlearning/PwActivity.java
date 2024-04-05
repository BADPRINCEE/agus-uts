package com.example.tarotlearning;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PwActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pw);
        // Inisialisasi button daftar
      Button buttonRegister = findViewById(R.id.Login);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke MenuActivity saat tombol "Daftar" ditekan
                Intent intent = new Intent(PwActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke MenuActivity saat tombol "Daftar" ditekan
                Intent intent = new Intent(PwActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
