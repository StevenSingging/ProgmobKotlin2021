package com.example.progmobkotlin2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.adapter.PetaniAdapter
import com.example.progmobkotlin2021.model.Petani

class CardView : AppCompatActivity() {
    lateinit var rv1 : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        rv1 = findViewById(R.id.rcv1)
        var listPetani = listOf(
            Petani(user = "S01",nama = "Steven S.S", jumlahLahan = "10",identifikasi = "5",tambahLahan = "25") ,
            Petani(user = "S02",nama = "Steven S.S", jumlahLahan = "100",identifikasi = "10",tambahLahan = "25"),
            Petani(user = "S03",nama = "Steven S.S", jumlahLahan = "15",identifikasi = "15",tambahLahan = "25"),
            Petani(user = "S04",nama = "Steven S.S", jumlahLahan = "20",identifikasi = "45",tambahLahan = "25"),
            Petani(user = "S05",nama = "Steven S.S", jumlahLahan = "30",identifikasi = "50",tambahLahan = "25")
        )
        val PetaniAdapter = PetaniAdapter(listPetani)

        rv1.apply {
            layoutManager = LinearLayoutManager(this@CardView)
            adapter = PetaniAdapter
        }

    }
}