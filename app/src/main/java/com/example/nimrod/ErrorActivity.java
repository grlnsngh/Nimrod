package com.example.nimrod;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide Action Bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
        setContentView(R.layout.error_login_screen);
    }
}
