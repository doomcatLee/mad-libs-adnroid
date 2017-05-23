package com.doomcat.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView mResultTextView;
    private Button mButton;

    public String textGenerate(String a, String b, String c){
        return ("Hello " + a + ", it seems that you really really like " + b + " but you're kind of lame, because you can travel to " + c + ".");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResultTextView = (TextView) findViewById(R.id.result);



        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String place = intent.getStringExtra("place");
        String food = intent.getStringExtra("food");


        mResultTextView.setText(textGenerate(name,food,place));
    }
}
