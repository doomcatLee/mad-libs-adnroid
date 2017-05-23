package com.doomcat.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class OptionsActivity extends AppCompatActivity {

    public static String storyOption;
    public static final String TAG = OptionsActivity.class.getSimpleName();
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        //Bind button
        mNextButton = (Button) findViewById(R.id.nextButton);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(OptionsActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.happyOption:
                if (checked)
                    storyOption = "happy";
                    Log.d(TAG, "HAPPY clicked");
                break;
            case R.id.sadOption:
                if (checked)
                    storyOption = "sad";
                    Log.d(TAG, "SAD clicked");
                break;
            case R.id.brutalOption:
                if (checked)
                    storyOption = "brutal";
                    Log.d(TAG, "BRUTAL clicked");
                break;
        }
    }

}
