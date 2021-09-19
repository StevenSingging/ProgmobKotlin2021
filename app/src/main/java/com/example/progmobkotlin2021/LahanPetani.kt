package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView


class LahanPetani : AppCompatActivity() {
    var items = arrayOf(
        "Abdulrohma", "Nama : AbdulRogman", "Total Jumlah Lahan : 1",
        "Jumlah Lahan yang Sudah Terindentifikasi :0", "Lahan yang bisa ditambahkan: 1"
    )
    lateinit var lvLahan: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lahan_petani)
        lvLahan = findViewById(R.id.lvLahan)
        lvLahan.adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, items )
    }
}