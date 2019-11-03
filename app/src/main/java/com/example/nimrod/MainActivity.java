package com.example.nimrod;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide Action Bar
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

        setContentView(R.layout.login_screen);

        final EditText username = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        final Button btn = findViewById(R.id.btnSignIn);

        btn.setText(R.string.signup);
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (username.getText().toString().equals("")) {
                    btn.setText(R.string.signup);
                } else {
                    btn.setText(R.string.signin);
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
                        buttonClicked(btn.getText().toString());
                    }
                }
        );

    }

    private void buttonClicked(String str) {

        if (str.equals("Sign Up")) {
            Intent i = new Intent(this, SignupActivity.class);
            startActivity(i);
        } else {
            // Sign In
            Toast.makeText(this, "Sign In", Toast.LENGTH_SHORT).show();
        }
    }

}
