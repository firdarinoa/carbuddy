package com.example.firdasahidi.carbuddy.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firdasahidi.carbuddy.R;

public class LoginActivity extends AppCompatActivity {

    Button btn_logins,btn_signups;
    EditText et_email, et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_email = (EditText) findViewById(R.id.et_email);
        btn_logins = (Button) findViewById(R.id.btn_logins);
        btn_logins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_email.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this, "Email or Password must Be filled.", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.animator.slide_from_right, R.animator.slide_to_left);
                    finish();
                }


            }
        });

        btn_signups = (Button) findViewById(R.id.btn_signups);
        btn_signups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                overridePendingTransition(R.animator.slide_from_right, R.animator.slide_to_left);
                finish();
            }
        });

        EditText et_email = (EditText) findViewById(R.id.et_email);
        EditText et_password = (EditText) findViewById(R.id.et_password);
    }

}
