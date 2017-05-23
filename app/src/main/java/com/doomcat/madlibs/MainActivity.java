package com.doomcat.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.playButton) Button mPlayButton;
    @Bind(R.id.titleTextView) TextView mTitleTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //TYPEFACES
        Typeface titleFont = Typeface.createFromAsset(getAssets(), "fonts/albas.ttf");
        mTitleTextView.setTypeface(titleFont);

        //Using and binding the interface onclick event
        mPlayButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mPlayButton){
            Intent intent = new Intent(MainActivity.this, OptionsActivity.class);
            startActivity(intent);
        }
    }

}
