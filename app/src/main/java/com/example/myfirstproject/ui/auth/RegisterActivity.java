package com.example.myfirstproject.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfirstproject.R;

public class RegisterActivity extends AppCompatActivity {

    private TextView tvMainTitle;
    private EditText etName, etEmail, etPassword, etConfirmPassword, etPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regster);

        etName = findViewById(R.id.sigin_up_et_name);
        etEmail = findViewById(R.id.sign_up_et_email);
        etPassword = findViewById(R.id.sign_up_et_password);
        etConfirmPassword = findViewById(R.id.sign_up_confim_pass);
        etPhoneNumber = findViewById(R.id.sign_up_et_phone);
        tvMainTitle = findViewById(R.id.textView7);

    }

    public void registerUser(View view) {

        tvMainTitle.setText("MName: " + etName.getText().toString());

        Toast toast = Toast.makeText(RegisterActivity.this, "Register: " + etName.getText().toString() + "\n" + etEmail.getText().toString(), Toast.LENGTH_SHORT);
        toast.show();
    }


}