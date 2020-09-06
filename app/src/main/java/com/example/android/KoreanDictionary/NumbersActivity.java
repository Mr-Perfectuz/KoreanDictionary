package com.example.android.KoreanDictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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


//
//        String [] words = new String[21];
//        words[0] = "One";
//        words[1] = "Two";
//        words[2] = "Three";
//        words[3] = "Four";
//        words[4] = "Five";
//        words[5] = "Six";
//        words[7] = "Seven";
//        words[8] = "Eight";
//        words[9] = "Nine";
//        words[10] = "Ten";
//        words[11] = "Twenty";
//        words[12] = "Thirty";
//        words[13] = "Forty";
//        words[14] = "Fifty";
//        words[15] = "Sixty";
//        words[16] = "Seventy";
//        words[17] = "Eighty";
//        words[18] = "Ninety";
//        words[19] = "One Hundred";
//        words[20] = "One Thousand";
//        words[21] = "Ten Thousand";

        Log.v("NumbersActivity", "Word at index 0: "+ words.get(0));
        Log.v("NumbersActivity", "Word at index 1: "+ words.get(1));
        Log.v("NumbersActivity", "Word at index 2: "+ words.get(2));
        Log.v("NumbersActivity", "Word at index 3: "+ words.get(3));
        Log.v("NumbersActivity", "Word at index 4: "+ words.get(4));
        Log.v("NumbersActivity", "Word at index 5: "+ words.get(5));
        Log.v("NumbersActivity", "Word at index 6: "+ words.get(6));
        Log.v("NumbersActivity", "Word at index 7: "+ words.get(7));
        Log.v("NumbersActivity", "Word at index 8: "+ words.get(8));
        Log.v("NumbersActivity", "Word at index 9: "+ words.get(9));



    }




}