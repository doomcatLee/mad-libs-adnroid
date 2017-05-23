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

public class MainActivity extends AppCompatActivity {

    private Button mPlayButton;
    private TextView mTitleTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //match XML and java together
        mPlayButton = (Button) findViewById(R.id.playButton);
        mTitleTextView = (TextView) findViewById(R.id.titleTextView);

        //TYPEFACES
        Typeface titleFont = Typeface.createFromAsset(getAssets(), "fonts/albas.ttf");
        //SET TYPEFONT
        mTitleTextView.setTypeface(titleFont);


        //Attach click event listener
        mPlayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });
    }
}
