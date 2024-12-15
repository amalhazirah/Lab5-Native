package com.example.dialapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        Button dialButton = findViewById(R.id.dialButton);

        dialButton.setOnClickListener(v -> {
            String phoneNumber = phoneNumberEditText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(intent);
        });
    }
}
