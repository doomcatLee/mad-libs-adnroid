package com.doomcat.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.annotation.Resource;

public class FormActivity extends AppCompatActivity {


    //Cute tag for this activity
    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView mInfoTextView;
    private Button mSubmitButton;
    private EditText mName;
    private EditText mMood;
    private EditText mVerb;
    private EditText mAdjective;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mSubmitButton = (Button) findViewById(R.id.submitButton);

        mName = (EditText) findViewById(R.id.nameEditText);
        mMood = (EditText) findViewById(R.id.moodEditText);
        mVerb = (EditText) findViewById(R.id.verbEditText);
        mAdjective = (EditText) findViewById(R.id.adjectiveEditText);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = mName.getText().toString();
                String mood = mMood.getText().toString();
                String verb = mVerb.getText().toString();
                String adjective = mAdjective.getText().toString();

                Intent intent = new Intent(FormActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("mood", mood);
                intent.putExtra("verb", verb);
                intent.putExtra("adjective", adjective);
                startActivity(intent);
            }
        });


        Typeface robotoFont = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        mInfoTextView = (TextView) findViewById(R.id.infoTextView);
        mInfoTextView.setTypeface(robotoFont);
    }
}
