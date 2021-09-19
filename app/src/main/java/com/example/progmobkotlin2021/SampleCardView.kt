package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class SampleCardView : AppCompatActivity() {
    lateinit var rvc : RecyclerView
    lateinit var ll : LinearLayout
    lateinit var cvw : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cv_item_petani)
    rvc = findViewById(R.id.rcv_petani)
    ll = findViewById(R.id.ll_petani)
    }
}