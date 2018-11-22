package com.example.usrdel.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_adaptador2.*

class AdaptadorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adaptador2)

        val arregloUsuarios = ArrayList<Usuario>()
        val usuarioUno = Usuario(
                "Adrian",
                29,
                (1989,6,10), sueldo 12.00)
        val usuarioDos = Usuario(
                "vicente",
                32,(1912,3,23), 15.00
        )

        val adaptadorUsuarios = ArrayAdapter<Usuario>(
         this,android.R.layout.simple_spinner_item,arregloUsuarios
        )

        spinner_Usuarios
        }
    }
}
