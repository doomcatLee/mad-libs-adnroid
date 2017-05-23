package com.doomcat.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.doomcat.madlibs.OptionsActivity.storyOption;

public class ResultActivity extends AppCompatActivity {

    @Bind(R.id.result) TextView mResultTextView;
    @Bind(R.id.replayButton) Button mReplayButton;

    public String textGenerate(String name, String mood, String verb, String adjective){
        if (storyOption == ("happy")){
            return ("The name, " + name + " is a " + adjective + " name for someone like you. Keep " + verb + "ing and stay " + mood);
        }else if (storyOption == ("sad")){
            return ("Hello " + name + ", \nIt turns out your friends and family decided to " + verb + " you. It's probably because you are " + adjective + " and " + mood);
        }else if (storyOption == ("brutal")){
            return (name + ", you're a shithead.");
        }else{
            return null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String verb = intent.getStringExtra("verb");
        String mood = intent.getStringExtra("mood");
        String adjective = intent.getStringExtra("adjective");

        //SET TEXT VIEW
        mResultTextView.setText(textGenerate(name, mood, verb, adjective));

        mReplayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
