package com.example.quiztap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout inputLayoutIdnum, inputLayoutPassw;
    private TextInputEditText inputEditTextIdnum, inputEditTextPassw;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutIdnum = (TextInputLayout) findViewById(R.id.inp_layout_idnum);
        inputLayoutPassw = (TextInputLayout) findViewById(R.id.inp_layout_passw);
        inputEditTextIdnum = (TextInputEditText) findViewById(R.id.inp_et_idnum);
        inputEditTextPassw = (TextInputEditText) findViewById(R.id.inp_et_passw);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btn_login:
                Intent homeDashIntent = new Intent(MainActivity.this, HomeDashActivity.class);
                startActivity(homeDashIntent);
                break;
        }
    }
}
