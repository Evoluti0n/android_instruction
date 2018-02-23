package com.example.my.tudortmund;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> studenList = new ArrayList<String>();
        for(int i =0; i<100;i++){
            studenList.add("Student " + i);
        }
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(
                this,
                R.layout.layout_item,
                R.id.item_view,
                studenList
        );
        ListView listView =(ListView) this.findViewById(R.id.list);
        listView.setAdapter(adapter);

        Context context = this;
        String text = "Hello Student";
        int duration = Toast.LENGTH_SHORT;

        // Add a listener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast toast = Toast.makeText(MainActivity.this,"Hello World"+i,Toast.LENGTH_SHORT);
                toast.show();
                Intent destailIntent = new Intent(MainActivity.this,
                        DetailActivity.class);
                startActivity(destailIntent);
            }
        });
    }
}
