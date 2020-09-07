
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

        words.add(0, "One");
        words.add(1 ,"Two");
        words.add(2 ,"Three");
        words.add(3 ,"Four");
        words.add(4 ,"Five");
        words.add(5 ,"Six");
        words.add(6 ,"Seven");
        words.add(7 ,"Eight");
        words.add(8 ,"Nine");
        words.add(9 ,"Ten");


        // Find the root view so we can add child views to it
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // Create a variable to keep track of the current index position

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        int index = 0;

        while (index <words.size()) {
            // Create a new TextView
            TextView wordView =new TextView(this);

            // Set the text to be word at the current index
            wordView.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout

            // Increment the index variable by 1
            rootView.addView(wordView);
            index++;
        }






    }
}
