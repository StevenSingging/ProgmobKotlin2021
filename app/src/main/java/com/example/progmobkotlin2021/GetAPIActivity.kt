package com.example.progmobkotlin2021

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progmobkotlin2021.adapter.APIAdapter
import com.example.progmobkotlin2021.model.DataItem
import com.example.progmobkotlin2021.model.ResponsePetani
import com.google.android.material.floatingactionbutton.FloatingActionButton
import network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetAPIActivity : AppCompatActivity() {
    lateinit var rvpet : RecyclerView
    lateinit var tabadd : FloatingActionButton
    val prefs_name = "session_login"
    lateinit var sharedPref : SharedPreferences

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_logout,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.btnLogout -> {
                val editor : SharedPreferences.Editor = sharedPref.edit()
                editor.clear()
                editor.apply()
                finish()
                var intent = Intent(this@GetAPIActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apiactivity)
        rvpet = findViewById(R.id.RVPetani1)
        tabadd = findViewById(R.id.tabAddPetani)

        sharedPref = getSharedPreferences(prefs_name, Context.MODE_PRIVATE)

        NetworkConfig().getService()
            .getPetaniAll()
            .enqueue(object : Callback<ResponsePetani?> {
                override fun onFailure(call: Call<ResponsePetani?>, t:
                Throwable) {
                    Toast.makeText(this@GetAPIActivity, t.localizedMessage,
                        Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(
                    call: Call<ResponsePetani?>,
                    response: Response<ResponsePetani?>
                ) {
                    rvpet.apply{
                        layoutManager = LinearLayoutManager(this@GetAPIActivity)
                        adapter = APIAdapter(response.body()?.data as List<DataItem>?)
                    }
                }
            })
        tabadd.setOnClickListener(View.OnClickListener{view ->
        var intent = Intent(this@GetAPIActivity, AddPetaniActivity::class.java )
            startActivity(intent)
        })

    }
}