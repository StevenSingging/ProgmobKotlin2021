package com.example.progmobkotlin2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class SampleList : AppCompatActivity() {
    lateinit var btnlv : Button
    lateinit var btnlahan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)
        btnlv = findViewById(R.id.btnShowList)
        btnlahan = findViewById(R.id.btnLahan)
        btnlv.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList,
                SampleListView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btnlahan.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList,
                LahanPetani::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
    }
}