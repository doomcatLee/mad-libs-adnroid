package com.doomcat.madlibs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.annotation.Resource;

public class FormActivity extends AppCompatActivity {


    //Cute tag for this activity
    public static final String TAG = MainActivity.class.getSimpleName();

    private Button mSubmitButton;
    private EditText mName;
    private EditText mFood;
    private EditText mPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mSubmitButton = (Button) findViewById(R.id.submitButton);

        mName = (EditText) findViewById(R.id.nameEditText);
        mFood = (EditText) findViewById(R.id.foodEditText);
        mPlace = (EditText) findViewById(R.id.placeEditText);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = mName.getText().toString();
                String place = mPlace.getText().toString();
                String food = mFood.getText().toString();

                Intent intent = new Intent(FormActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("place", place);
                intent.putExtra("food", food);
                startActivity(intent);
            }
        });
    }
}
