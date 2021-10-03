package com.example.progmobkotlin2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class SampleList : AppCompatActivity() {
    lateinit var btnlv : Button
    lateinit var btnryc : Button
    lateinit var btncv : Button
    lateinit var btnlt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)
        btnlv = findViewById(R.id.btnShowList)
        btnryc = findViewById(R.id.btnSampleRV)
        btncv = findViewById(R.id.btn_card)
        btnlt = findViewById(R.id.btn_lahan)

        btnlv.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList,
                SampleListView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btnryc.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList,
                SampleRecyclerView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btncv.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList,
                CardView::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnlt.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@SampleList,
                LahanPetani::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}