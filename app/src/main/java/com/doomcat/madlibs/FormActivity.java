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

import butterknife.Bind;
import butterknife.ButterKnife;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {
    //Cute tag for this activity
    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView mInfoTextView;
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.nameEditText) EditText mName;
    @Bind(R.id.moodEditText) EditText mMood;
    @Bind(R.id.verbEditText) EditText mVerb;
    @Bind(R.id.adjectiveEditText) EditText mAdjective;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);

        Typeface robotoFont = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        mInfoTextView = (TextView) findViewById(R.id.infoTextView);
        mInfoTextView.setTypeface(robotoFont);

        mSubmitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v ==mSubmitButton){
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
    }
}
