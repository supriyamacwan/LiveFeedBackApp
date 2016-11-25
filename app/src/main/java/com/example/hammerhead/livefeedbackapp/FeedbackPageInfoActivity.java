package com.example.hammerhead.livefeedbackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FeedbackPageInfoActivity extends AppCompatActivity {

    Button givefeedbackbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_page_info_act);
        givefeedbackbutton = (Button)findViewById(R.id.feedback_button);
        givefeedbackbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FeedbackPageInfoActivity.this, GiveFeedbackPageActivity.class);
                startActivity(i);
            }
        });


    }
}