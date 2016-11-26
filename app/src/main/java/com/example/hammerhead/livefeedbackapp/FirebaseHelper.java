package com.example.hammerhead.livefeedbackapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by hammerhead on 11/23/2016.
 */

public class FirebaseHelper {
    private static FirebaseDatabase firebaseDatabase;
    private static DatabaseReference usernameDatabaseReference;
    private static DatabaseReference questionDatabaseReference;
    public static void init() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        usernameDatabaseReference = firebaseDatabase.getReference().child("username");
        questionDatabaseReference = firebaseDatabase.getReference().child("question");


    }
    public static void write(String name,String question){
        usernameDatabaseReference.child("livefeedbackapp").child("123").setValue(name);
        questionDatabaseReference.child("livefeedbackapp").child("456").setValue(question);


    }






}
