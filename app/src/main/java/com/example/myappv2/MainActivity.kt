package com.example.myappv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val KoverensiDollar : Button = findViewById(R.id.k_dolar)
        KoverensiDollar.setOnClickListener(this)

        val KoverensiSuhu : Button = findViewById(R.id.k_suhu)
        KoverensiSuhu.setOnClickListener(this)


    }

    override fun onClick(v : View?) {
       when (v?.id){
        R.id.k_dolar->{
            val moveKoverensiDolarIntent = Intent (this@MainActivity, DollarActivity ::class.java)
            startActivity(moveKoverensiDolarIntent)
        }
           R.id.k_suhu->{
               val moveKoverensiSuhuIntent = Intent(this@MainActivity,SuhuActivity::class.java)
               startActivity(moveKoverensiSuhuIntent)
           }
       }
    }
}