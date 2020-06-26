package com.example.jieun0921;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class Write extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        loadList();

        ImageButton write =(ImageButton)findViewById(R.id.StartBtn);
        ImageButton camera =(ImageButton)findViewById(R.id.CameraBtn);

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Diary.class);
                startActivity(intent);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), camera.class);
                startActivity(intent);
            }
        });

    }
    
    public void loadList() {
        LinearLayout layout=(LinearLayout)findViewById(R.id.list);
        layout.setBackgroundColor(Color.argb(100,0,0,66));
        String[] lists = fileList();
        if(lists.equals(null)||lists.length==0) {
            layout.addView(makeTextView("일기를 작성해주세요!", "nt"));
        }else{
            layout.removeAllViews();
            for(int i=0; i<lists.length; i++){
                if(lists[i].endsWith(".txt"))
                layout.addView(makeTextView(lists[i], "t"+i));
            }
            if(layout.getChildCount() == 0)
                layout.addView(makeTextView("일기를 작성해주세요!", "nt"));
        }
    }

    private TextView makeTextView(String label, String tag) {
        TextView tv = new TextView(this);
        tv.setText(label);
        tv.setTag(tag);
        return tv;
    }
}