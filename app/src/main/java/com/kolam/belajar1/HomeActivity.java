package com.kolam.belajar1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        btnLogin.setOnClickListener(v -> {
            //ini untuk menampilkan peringatan
            Toast.makeText(this, "Berhasil di Klik", Toast.LENGTH_SHORT).show();

            //intent Expilicit (berpindah layar dalam aplikasi)
            // berpindah layar ( cara jadul)
            // Berppindah layar dari HomeActivity ke (,) MainActivity
            //Intent intent = new Intent (HomeActivity.this,MainActivity.class);
           // startActivity(intent);

            if (edtUsername.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty()) {
                Toast.makeText(this, "Lengkapi Data dulu", Toast.LENGTH_SHORT).show();
            }else if (edtUsername.getText().length() <= 3){
                Toast.makeText(this, "Username Kurang", Toast.LENGTH_SHORT).show();

            }else {
                //cara cpeat
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
            }


        });
    }

    private void initView() {
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
    }
}