
package com.example.android.KoreanDictionary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view) {
        Intent intent_Numbers = new Intent(this, NumbersActivity.class);
        startActivity(intent_Numbers);
    }

    public void openFamilyList(View view) {
        Intent intent_Family = new Intent(this, FamilyActivity.class);
        startActivity(intent_Family);
    }

    public void openColorsList(View view) {
        Intent intent_Colors = new Intent(this, ColorsActivity.class);
        startActivity(intent_Colors);
    }

    public void openPhrasesList(View view ) {
        Intent intent_Phases = new Intent(this, PhrasesActivity.class);
        startActivity(intent_Phases);
    }
}
