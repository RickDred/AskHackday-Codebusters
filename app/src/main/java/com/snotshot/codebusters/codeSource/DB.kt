package com.snotshot.codebusters.codeSource

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class DB {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var database: DatabaseReference
    private val url = "https://codebusters-8c94f-default-rtdb.firebaseio.com"
    fun connectDB(): DatabaseReference {
        database = Firebase.database(url).reference
        return database
    }
    fun checkUser(): FirebaseUser? {
        firebaseAuth = FirebaseAuth.getInstance()
        return firebaseAuth.currentUser
    }
}