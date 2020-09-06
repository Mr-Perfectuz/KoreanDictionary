
package com.example.android.KoreanDictionary;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //set the clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener() {

        // create new intent to open the {@Link NumbersActivity}
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of words about numbers", Toast.LENGTH_SHORT).show();
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                //Start new Activity
                startActivity(numbersIntent);
            }
        });

        //find the View that shows the Colors Category and cast
        TextView colors = (TextView) findViewById(R.id.colors);

        //set the ClickListener on that View
        colors.setOnClickListener(new View.OnClickListener() {

        // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of words about Colors", Toast.LENGTH_SHORT).show();
                Intent intent_Colors = new Intent(MainActivity.this, ColorsActivity.class);

                //Start new Activity
                startActivity(intent_Colors);
            }
        });

        //find the View that shows the FamilyMembers Category and cast
        TextView family_Members = (TextView) findViewById(R.id.family);

        //set the ClickListener on that View
        family_Members.setOnClickListener(new View.OnClickListener() {

        // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of words about Family Members ", Toast.LENGTH_SHORT).show();
                Intent intent_family_members = new Intent(MainActivity.this, FamilyActivity.class);

                //Start new Activity
                startActivity(intent_family_members);

            }
        });

        //find the View that shows the Phrases Category and cast it
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //set the ClickListener on that View
        phrases.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of about Phrases", Toast.LENGTH_SHORT).show();
                Intent intent_phrases = new Intent(MainActivity.this, PhrasesActivity.class);

                startActivity(intent_phrases);
            }
        });
    }


}
