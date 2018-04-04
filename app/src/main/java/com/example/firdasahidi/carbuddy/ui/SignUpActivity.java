package com.example.firdasahidi.carbuddy.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.firdasahidi.carbuddy.R;

public class SignUpActivity extends AppCompatActivity {

    Button btn_signup2,btn_login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btn_signup2 = (Button) findViewById(R.id.btn_signup2);
        btn_signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this,"Sign Up Success!", Toast.LENGTH_SHORT).show();
            }
        });

        btn_login2 = (Button) findViewById(R.id.btn_login2);
        btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.animator.slide_from_right, R.animator.slide_to_left);
                finish();
            }
        });

    }
}
