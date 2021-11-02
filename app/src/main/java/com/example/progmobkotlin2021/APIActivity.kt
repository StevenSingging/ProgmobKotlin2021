package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.adapter.APIAdapter
import com.example.progmobkotlin2021.adapter.UsersAdapter
import com.example.progmobkotlin2021.model.DataItem
import com.example.progmobkotlin2021.model.ResponseItem
import com.example.progmobkotlin2021.model.ResponsePetani
import network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class APIActivity : AppCompatActivity() {
    lateinit var rvUser1 : RecyclerView
    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_apiactivity)
        rvUser1 = findViewById(R.id.RVPetani1)


    }
}