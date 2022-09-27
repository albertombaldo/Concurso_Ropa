package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        siguienteVista()
    }
    fun siguienteVista(){
        val btn: Button = findViewById(R.id.button2)
        btn.setOnClickListener{
            var editText = findViewById<EditText>(R.id.editTextTextPersonName2)
            var nombre: String = editText.text.toString()
            val intent2 = Intent(this, PantallaFinal:: class.java).apply {
                putExtra("nombreUsuario", nombre)
            }
            val intent = Intent(this, Radio:: class.java)
            startActivity(intent2)
            startActivity(intent)
        }
    }
}