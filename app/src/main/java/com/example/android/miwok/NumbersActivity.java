
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);



        // Create an array of words
        ArrayList<String> words = new ArrayList<String>(10);

        words.add(0, "one");
        words.add(1 ,"two");
        words.add(2 ,"three");
        words.add(3 ,"four");
        words.add(4 ,"five");
        words.add(5 ,"six");
        words.add(6 ,"seven");
        words.add(7 ,"eight");
        words.add(8 ,"nine");
        words.add(9 ,"ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
            TextView wordView =new TextView(this);
            wordView.setText(words.get(1));
            rootView.addView(wordView);




    }
}
