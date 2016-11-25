package com.example.hammerhead.livefeedbackapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


public class GiveFeedbackPageActivity extends AppCompatActivity {
    Button postbutton;
    EditText username;
    EditText feedbackquestion;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_feedback_page);
        FirebaseHelper.init();
        username = (EditText)findViewById(R.id.user_name);
        feedbackquestion = (EditText)findViewById(R.id.feedback_question);
        postbutton = (Button)findViewById(R.id.post_button);
        postbutton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               String name = username.getText().toString();
                                               String question = feedbackquestion.getText().toString();
                                           }
                                       });



    }

}
