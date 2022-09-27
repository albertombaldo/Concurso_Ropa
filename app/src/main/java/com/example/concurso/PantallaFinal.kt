package com.example.concurso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PantallaFinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_final)
        val nombre = intent.getStringExtra("nombreUsuario")
        val textView = findViewById<TextView>(R.id.textView6).apply { text = "El estilo más afín a " + nombre + " es" }
    }
}