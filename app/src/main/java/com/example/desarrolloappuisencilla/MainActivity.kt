package com.example.desarrolloappuisencilla

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cambiarTextoColor(view: View) { // Creación de la función "cambiarTextoColor"
        val textoEditado = findViewById<EditText>(R.id.editTextText) // Creación de la variable "textoEditado" y asignación de la ID del widget de "Plain Text"
        textoEditado.setTextColor(Color.BLUE) // Cambio de color a "azul" de la variable "textoEditado"
    }

}