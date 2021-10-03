package com.example.progmobkotlin2021.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.R
import com.example.progmobkotlin2021.model.Petani

class PetaniAdapter(val petani: List<Petani>): RecyclerView.Adapter<PetaniAdapter.PetaniHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PetaniAdapter.PetaniHolder {
        return PetaniHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_sample_card_view,parent,false))
    }

    override fun onBindViewHolder(holder: PetaniAdapter.PetaniHolder, position: Int) {
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
                txtUser = findViewById(R.id.txtuser2)
                txtNama = findViewById(R.id.txtnama2)
                txtJumlahLahan = findViewById(R.id.txtjumlahlahan2)
                txtIdentifikasi = findViewById(R.id.txtidentifikasi2)
                txtTambahLahan = findViewById(R.id.txttambahlahan2)
                txtUser.text = petani.user
                txtNama.text = petani.nama
                txtJumlahLahan.text = petani.jumlahLahan
                txtIdentifikasi.text = petani.identifikasi
                txtTambahLahan.text = petani.tambahLahan
            }
        }
    }
}