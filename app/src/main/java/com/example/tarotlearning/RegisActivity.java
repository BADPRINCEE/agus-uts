package com.example.tarotlearning;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        // Inisialisasi button daftar
      Button buttonRegister = findViewById(R.id.button1);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke MenuActivity saat tombol "Daftar" ditekan
                Intent intent = new Intent(RegisActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
