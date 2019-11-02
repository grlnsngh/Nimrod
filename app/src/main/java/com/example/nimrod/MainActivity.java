package com.example.nimrod;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide Action Bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        setContentView(R.layout.login_screen);

        final EditText username = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        final Button btn = findViewById(R.id.btnSignIn);

        btn.setText("Sign Up");
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (username.getText().toString().equals("")) {
                    btn.setText("Sign Up");
                } else {
                    btn.setText("Sign In");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });


        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonClicked(view);
                    }
                }
        );

    }

    private void buttonClicked(View view) {
        Button btn = findViewById(R.id.btnSignIn);
        if (btn.getText().toString().equals("Sign Up")) {

        } else {
            // Sign In

        }
    }

}
