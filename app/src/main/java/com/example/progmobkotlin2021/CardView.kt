package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class CardView : AppCompatActivity() {
    lateinit var rv1 : RecyclerView
    lateinit var lt1 : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)
        rv1 = findViewById(R.id.rcv1)
        lt1 = findViewById(R.id.lt1)
    }
}