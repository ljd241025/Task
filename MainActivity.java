package com.example.admin.mytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view){
        Intent intent=new Intent(this,TaskOne.class);
        startActivity(intent);
    }

    public void button2(View view){
        Intent intent=new Intent(this,TaskTwo.class);
        startActivity(intent);
    }

    public void button3(View view){
        Intent intent=new Intent(this,TaskThree.class);
        startActivity(intent);
    }
}
