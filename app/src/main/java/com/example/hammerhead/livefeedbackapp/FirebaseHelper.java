package com.example.hammerhead.livefeedbackapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by hammerhead on 11/23/2016.
 */

public class FirebaseHelper {
    private static FirebaseDatabase firebaseDatabase;
    private static DatabaseReference usernameDatabaseReference;
    public static void init() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        usernameDatabaseReference = firebaseDatabase.getReference().child("username");


    }






}
