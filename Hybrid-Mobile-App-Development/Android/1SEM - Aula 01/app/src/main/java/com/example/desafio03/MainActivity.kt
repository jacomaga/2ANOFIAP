package com.example.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImc.setOnClickListener {
            val altura = txtAltura.text.toString().toDouble()
            var imc: Double

            if(rbMasculino.isChecked){
                imc = (62.1 * altura) - 44.7
            }
            else{
                imc = (72.7 * altura) - 58
            }
            val dec = DecimalFormat("#.0")
            val mensagem = "Seu imc é de ${dec.format(imc)} kg"
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}