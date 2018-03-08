package com.example.apurva.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] myArray;
    AutoCompleteTextView actv;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=findViewById(R.id.actv);
        myArray=getResources().getStringArray(R.array.data);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myArray);
        actv.setAdapter(adapter);
        actv.setThreshold(1);
    }
}
