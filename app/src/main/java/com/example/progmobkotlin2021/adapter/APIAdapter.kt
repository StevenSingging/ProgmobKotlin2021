package com.example.progmobkotlin2021.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.R
import com.example.progmobkotlin2021.model.DataItem


class APIAdapter(val users: List<DataItem>?):
        RecyclerView.Adapter<APIAdapter.UsersHolder>() {
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): UsersHolder {
            return UsersHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.activity_apiactivity, parent, false))
        }
        override fun onBindViewHolder(holder: APIAdapter.UsersHolder,
                                      position: Int) {
            holder.bindUsers(users?.get(position))
        }
        override fun getItemCount(): Int {
            return users?.size ?: 0
        }
        class UsersHolder(view: View) : RecyclerView.ViewHolder(view) {
            lateinit var txtNama: TextView
            lateinit var txtprov: TextView
            lateinit var txtAlamat: TextView
            lateinit var txtkab: TextView
            fun bindUsers(users: DataItem?) {
                itemView.apply {
                    txtNama = findViewById(R.id.nama1)
                    txtprov = findViewById(R.id.provinsi)
                    txtAlamat = findViewById(R.id.alamat1)
                    txtkab = findViewById(R.id.kabupaten)
                    txtNama.text = users?.nama
                    txtprov.text = users?.provinsi
                    //val address = "${users?.address?.street},${users?.address?.city}, ${users?.address?.suite}, ${users?.address?.zipcode}"
                    txtAlamat.text = users?.alamat
                    txtkab.text = users?.kabupaten
                }
            }
        }
    }
