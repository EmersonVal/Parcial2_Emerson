package com.example.parcial2_emerson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class animales3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animales3)
    }
    fun siguente (vista: View){
        val ventana:Intent = Intent(applicationContext,animales2::class.java)
        startActivity(ventana)
    }
    fun previo (Vista:View){
        val ventana: Intent = Intent(applicationContext,animales3::class.java)
        startActivity(ventana)
        }
}