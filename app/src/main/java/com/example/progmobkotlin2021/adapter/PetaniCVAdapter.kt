package com.example.progmobkotlin2021.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.R
import com.example.progmobkotlin2021.model.Petani

class PetaniCVAdapter (val petani: List<Petani>): RecyclerView.Adapter<PetaniCVAdapter.PetaniHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PetaniCVAdapter.PetaniHolder {
        return PetaniHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item_dutatani, parent, false))
    }

        override fun onBindViewHolder(holder: PetaniCVAdapter.PetaniHolder, position: Int) {
            holder.bindPetani(petani[position])
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
                    txtUser = findViewById(R.id.txtUserCV)
                    txtNama = findViewById(R.id.txtNamaCV)
                    txtJumlahLahan = findViewById(R.id.txtJumlahLahanCV)
                    txtIdentifikasi = findViewById(R.id.txtIdentifikasiCV)
                    txtTambahLahan = findViewById(R.id.txtTambahLahanCV)
                    txtUser.text = petani.user
                    txtNama.text = petani.nama
                    txtJumlahLahan.text = petani.jumlahLahan
                    txtIdentifikasi.text = petani.identifikasi
                    txtTambahLahan.text = petani.tambahLahan
                }
            }
        }
    }

