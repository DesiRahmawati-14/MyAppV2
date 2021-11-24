package com.example.myappv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DollarActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var NilaiRupiah: EditText
    private lateinit var HasilKoverensidolar: TextView
    private lateinit var CekDollar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dollar)

        supportActionBar?.title="Konversi Dollar"

        NilaiRupiah = findViewById(R.id.n_rupiah)
        HasilKoverensidolar = findViewById(R.id.h_kdolar)
        CekDollar = findViewById(R.id.c_dolar)

        CekDollar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.c_dolar) {
            val inputnilairupiah = NilaiRupiah.text.toString().trim()
            var isEmptyFields = false

            if (inputnilairupiah.isEmpty()) {
                isEmptyFields = true
                NilaiRupiah.error = "Field ini tidak boleh kosong"

            }
            if (!isEmptyFields) {
                val hasil = inputnilairupiah.toDouble() / 15000
                HasilKoverensidolar.text = "$ %.2f".format(hasil)
            }
        }

    }

}