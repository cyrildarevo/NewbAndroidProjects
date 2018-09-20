package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //todo add words here

        ArrayList<Word> words = new ArrayList<Word>();

        // This is how elements should be added to the array list

        words.add(new Word("waahad", "one"));
        words.add(new Word("itnaan", "two"));
        words.add(new Word("talaatah", "three"));
        words.add(new Word("arbah", "four"));
        words.add(new Word("khamsah", "five"));
        words.add(new Word("sittah", "six"));
        words.add(new Word("sabah", "seven"));
        words.add(new Word("tamaniya", "eight"));
        words.add(new Word("tissah", "nine"));
        words.add(new Word("aasharah", "ten"));





        WordAdapter Adapter = new WordAdapter(this, words);

        ListView lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(Adapter);

        /*

        Displaying array list elements
        Log.v("NumbersActivity", " all " + words);
        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));


        int indxr = 0;
        while (indxr<10) {
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(indxr));
        rootView.addView(wordView);

        indxr++;
        }

        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        Log.v("NumbersActivity", "Word at index 0: " + words[5]);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show();
        }
        });


        */
    }

}
