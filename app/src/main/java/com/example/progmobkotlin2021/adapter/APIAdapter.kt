package com.example.progmobkotlin2021.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.GetAPIActivity
import com.example.progmobkotlin2021.R
import com.example.progmobkotlin2021.UpdatePetaniActivity
import com.example.progmobkotlin2021.model.DataItem
import com.example.progmobkotlin2021.model.ResponseAddPetani
import com.example.progmobkotlin2021.model.ResponsePetani
import network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class APIAdapter(val users: List<DataItem>?):
        RecyclerView.Adapter<APIAdapter.PetaniHolder>() {
    lateinit var mContext: Context
    lateinit var adapter : APIAdapter
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): PetaniHolder {
            return PetaniHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.userapi, parent, false))
        }
        override fun onBindViewHolder(holder: APIAdapter.PetaniHolder, position: Int) {
            holder.bindUsers(users?.get(position))
            var popup = PopupMenu(holder.itemView.context, holder.itemView)
            popup.menu.add(Menu.NONE, 0, 0, "Edit")
            popup.menu.add(Menu.NONE, 1, 1, "Delete")
            popup.setOnMenuItemClickListener { menuItem ->
                val id = menuItem.itemId
                mContext = holder.itemView.context
                if (id == 0) {
                    var bundle = Bundle()
                    var idTmp = users?.get(position)?.id.toString()
                    var namaTmp = users?.get(position)?.nama.toString()

                    bundle.putString("idPetani", idTmp)
                    bundle.putString("NamaPetani", namaTmp)
                    var intent = Intent(mContext, UpdatePetaniActivity::class.java)
                    intent.putExtras(bundle)
                    mContext.startActivity(intent)
                } else if (id == 1) {
                    var idTmp = users?.get(position)?.id.toString()
                    NetworkConfig().getService()
                        .deletePetani(idTmp.toInt())
                        .enqueue(object : Callback<ResponseAddPetani?> {
                            override fun onFailure(
                                call: Call<ResponseAddPetani?>, t:
                                Throwable
                            ) {
                                Toast.makeText(
                                    holder.itemView.context, t.localizedMessage,
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                            override fun onResponse(
                                call: Call<ResponseAddPetani?>,
                                response: Response<ResponseAddPetani?>
                            ) {
                                Toast.makeText(
                                    holder.itemView.context,
                                    "Berhasil Hapus Data",
                                    Toast.LENGTH_SHORT
                                )

                                (mContext as GetAPIActivity).finish()
                                var intent = Intent(mContext, GetAPIActivity::class.java)
                                mContext.startActivity(intent)
                            }
                        })
                }
                false
            }
            holder.itemView.setOnClickListener(View.OnClickListener { view ->
                popup.show()
            })
        }
        override fun getItemCount(): Int {
            return users?.size ?: 0
        }
        class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
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
