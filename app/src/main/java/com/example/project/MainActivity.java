package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button click;


    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // används för att kunna lagra preference
        myPreferenceRef = getPreferences(MODE_PRIVATE);
        // används för att kunna edit preference
        myPreferenceEditor = myPreferenceRef.edit();

        click = findViewById(R.id.swap);

        //skapar en ny instans av textview
        TextView prefTextRef=new TextView(this);
        //länkar preftextref med id
        prefTextRef=(TextView)findViewById(R.id.textView123);
        //
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

}
