package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView


class LahanPetani : AppCompatActivity() {

    lateinit var rvw : RecyclerView
    lateinit var lt : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_item_dutatani)
        rvw = findViewById(R.id.rvLatihan1)
        lt = findViewById(R.id.Linearrr)

    }
}