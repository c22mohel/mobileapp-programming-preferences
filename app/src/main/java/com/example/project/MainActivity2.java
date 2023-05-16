package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button tillbacks;

    private SharedPreferences myPreferenceRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // för tillbacka knap
        tillbacks = findViewById(R.id.byttill1);

        // används för att kunna lagra preference
        myPreferenceRef = getSharedPreferences("hej", MODE_PRIVATE);

        //skapar en ny instans av textview
        TextView prefTextRef=new TextView(this);
        //länkar preftextref med id
        prefTextRef=(TextView)findViewById(R.id.textView2);
        //visar perference
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));

        tillbacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });




    }
}