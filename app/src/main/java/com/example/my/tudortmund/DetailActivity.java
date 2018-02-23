package com.example.my.tudortmund;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity{
    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent =  DetailActivity.this.getIntent();
        String studentName ="";

        if(intent.hasExtra("student_Name")){
            studentName = intent.getStringExtra("student_Name");
        }

        TextView textView =(TextView) this.findViewById(R.id.text_detail);
        textView.setText(studentName);

    }
}
