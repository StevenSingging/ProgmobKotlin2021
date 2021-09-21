package com.example.progmobkotlin2021.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.R
import com.example.progmobkotlin2021.model.Petani

class RV(val petani: List<Petani>): RecyclerView.Adapter<RV.PetaniHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RV.PetaniHolder {
        return PetaniHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_sample_recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RV.PetaniHolder, position: Int) {
        holder.bindPetani(petani [position])
    }

    override fun getItemCount(): Int {
        return petani.size

    }

    class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUser: TextView
        lateinit var txtNama: TextView
        lateinit var txtJumlahLahan: TextView
        lateinit var txtIdentifikasi: TextView
        lateinit var txtTambahLahan: TextView
        fun bindPetani(petani: Petani) {
            itemView.apply {
                txtUser = findViewById(R.id.txtUser1)
                txtNama = findViewById(R.id.txtNama1)
                txtJumlahLahan = findViewById(R.id.txtJumlahLahan1)
                txtIdentifikasi = findViewById(R.id.txtIdentifikasi1)
                txtTambahLahan = findViewById(R.id.txtTambahLahan1)
                txtUser.text = petani.user
                txtNama.text = petani.nama
                txtJumlahLahan.text = petani.jumlahLahan
                txtIdentifikasi.text = petani.identifikasi
                txtTambahLahan.text = petani.tambahLahan
            }
        }
    }
}