package com.doomcat.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView mResultTextView;
    private Button mReplayButton;

    public String textGenerate(String a, String b, String c){
        return ("Hello " + a + ", \nIt seems that you really really like " + b + " but you're kind of lame, because you can't travel to " + c + " right now.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResultTextView = (TextView) findViewById(R.id.result);
        mReplayButton = (Button) findViewById(R.id.replayButton);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String place = intent.getStringExtra("place");
        String food = intent.getStringExtra("food");

        //SET TEXT VIEW
        mResultTextView.setText(textGenerate(name, food, place));

        mReplayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
