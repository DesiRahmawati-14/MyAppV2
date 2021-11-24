package com.example.myappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SuhuActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var NilaiSuhu : EditText
    private lateinit var hFarenheit : TextView
    private lateinit var hReamor : TextView
    private lateinit var hKelvin : TextView
    private lateinit var cSuhu : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suhu)

        supportActionBar?.title="Konversi Suhu"

        NilaiSuhu = findViewById(R.id.n_suhu)
        hFarenheit = findViewById(R.id.h_kfarenheit)
        hReamor = findViewById(R.id.h_kreamor)
        hKelvin = findViewById(R.id.h_kelvin)
        cSuhu = findViewById(R.id.c_suhu)

        cSuhu.setOnClickListener(this)
    }

    override fun onClick(v : View?) {
        if(v?.id==R.id.c_suhu){
            val InputSuhu = NilaiSuhu.text.toString().trim()

            if (InputSuhu.isNotEmpty()){
                val hasilFahrenheit = (InputSuhu.toDouble()*9/5)+32
                hFarenheit.text = hasilFahrenheit.toString()+"Fahrenheit"

                val hasilReamur = (InputSuhu.toDouble()*4/5)
                hReamor.text = hasilReamur.toString()+"Reamur"

                val hasilKelvin = (InputSuhu.toDouble()+273)
                hKelvin.text = hasilKelvin.toString()+"Kelvin"
            }
        }
    }
}