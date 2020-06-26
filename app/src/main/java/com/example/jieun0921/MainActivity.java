package com.example.jieun0921;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "OnCreate 호출됨", Toast.LENGTH_SHORT).show();

        ImageButton button1 = (ImageButton) findViewById(R.id.MemoButton);
        ImageButton button2 = (ImageButton) findViewById(R.id.PayButton);
        ImageButton button3 = (ImageButton) findViewById(R.id.DiaryButton);
        ImageButton button4 = (ImageButton) findViewById(R.id.CameraButton);

        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Memo.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pay.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Write.class);
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),camera.class);
                startActivity(intent);
            }
        });
    }
}