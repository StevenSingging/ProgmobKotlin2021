package com.example.progmobkotlin2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInputNama : Button
    lateinit var edInputNama : EditText
    lateinit var btnhelp : Button
    lateinit var btnlinear : Button
    lateinit var btnConstraint : Button
    lateinit var btnTable : Button
    lateinit var btnProtein : Button
    lateinit var btnDuta : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = "Halo Progmob"
        btnInputNama = findViewById(R.id.btn_ambil_nama)
        btnhelp = findViewById(R.id.btn_help)
        edInputNama = findViewById(R.id.ed_input_nama)
        btnlinear = findViewById(R.id.btn_linear)
        btnConstraint = findViewById(R.id.btn_constraint)
        btnTable = findViewById(R.id.btn_tabel)
        btnProtein = findViewById(R.id.btn_protein)
        btnDuta = findViewById(R.id.btn_duta)
        btnInputNama.setOnClickListener(View.OnClickListener { view ->
            var strTmp = edInputNama.text.toString()
            tvMain.text = strTmp
        })
        btnhelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)
            var intent = Intent (this@MainActivity,
                HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
        btnlinear.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                TestLinear::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btnConstraint.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                ConstraintActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btnTable.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                TableActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btnProtein.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                ProteinActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
        btnDuta.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var intent = Intent(this@MainActivity,
                DutataniActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        })
    }
}