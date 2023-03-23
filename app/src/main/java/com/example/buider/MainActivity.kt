package com.example.buider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val instance = CustomBuilderClass("A","B","C")
        val instance2 = CustomBuilderClass.Builder()
            .setProper1("K")
            .setProper2("I")
            .setProper3("H")
            .build()

        Log.d("KKK",instance.toString())
        Log.d("KKK1",instance2.toString())

    }
}