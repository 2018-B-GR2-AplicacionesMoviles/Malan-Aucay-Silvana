package com.example.usrdel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_verLista.setOnClickListener {

            this.irPantallaLista()
        }
        but_IngresarDatos.setOnClickListener {

            this.irPantalla4()
        }

    }
    fun irPantallaLista(){
        val intentIrPantallaLista = Intent(this,ListaActivity::class.java)
        startActivity(intentIrPantallaLista)

    }
    fun irPantalla4(){
        val intentIrPantalla4 = Intent(this,Pantalla4Activity::class.java)
        startActivity(intentIrPantalla4)


    }
    }
