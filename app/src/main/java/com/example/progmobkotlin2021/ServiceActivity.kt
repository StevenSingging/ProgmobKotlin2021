package com.example.progmobkotlin2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var btnget : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        btnget = findViewById(R.id.btnGetAPI)

        btnget.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@ServiceActivity,
                GetAPIActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}