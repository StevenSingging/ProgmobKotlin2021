package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView


class LahanPetani : AppCompatActivity() {
    var items = arrayOf(
        "Abdulrohma", "Nama : AbdulRogman", "Total Jumlah Lahan : 1",
        "Jumlah Lahan yang Sudah Terindentifikasi :0", "Lahan yang bisa ditambahkan: 1"
    )
    lateinit var lvLahan: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rv_item_dutatani)

    }
}