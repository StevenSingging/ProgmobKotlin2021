package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class SampleRecyclerView : AppCompatActivity() {
    lateinit var rva : RecyclerView
    lateinit var la : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)
        rva = findViewById(R.id.rvLatihan)
        la = findViewById(R.id.linear)

    }
}