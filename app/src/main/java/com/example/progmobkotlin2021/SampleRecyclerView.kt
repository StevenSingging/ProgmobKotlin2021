package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.recyclerview.widget.RecyclerView

class SampleRecyclerView : AppCompatActivity() {
    lateinit var rva : RecyclerView
    lateinit var sv : SearchView
    lateinit var l : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_item_dutatani)
        rva = findViewById(R.id.rvLatihan1)
        sv = findViewById(R.id.searchView)
        l = findViewById(R.id.Linearrr)

    }
}