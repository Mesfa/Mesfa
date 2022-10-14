package com.example.mesifx01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mesifx01.src.Flag;

public class MainActivity2 extends BaseActivity {
    EditText etched;
    String str1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etched = findViewById(R.id.editcheck);
    }
    public void check(View view){
        String keyWorld = etched.getText().toString().trim();
        String world = this.getResources().getString(R.string.World);
        String s = Flag.checkPasswd(world);
        String[] arr = s.split(" ");
        for (int i=arr.length-10;i< arr.length;i++){
            str1 = str1+arr[i];
        }
        if (!keyWorld.equals(str1)){
            android.os.Process.killProcess(android.os.Process.myPid());
        }
        else {
            Toast.makeText(this,"外面的世界好大！",Toast.LENGTH_SHORT).show();
        }
    }
}