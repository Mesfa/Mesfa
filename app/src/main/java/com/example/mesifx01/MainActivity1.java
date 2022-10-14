package com.example.mesifx01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity1 extends BaseActivity {
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        username = findViewById(R.id.username);
        password = findViewById(R.id.editTextTextPassword);
    }
    public void Login(View view) throws InterruptedException {
        String name = username.getText().toString().trim();
        String passwd = password.getText().toString().trim();
        if (!name.equals(this.getResources().getString(R.string.username))&&!passwd.equals(this.getResources().getString(R.string.password))){
                Toast.makeText(this,"也许生活需要那一抹奇幻色彩",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"······Sakura······Sakura······Sakura！",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity1.this,MainActivity2.class);
            startActivity(intent);
        }
    }
}