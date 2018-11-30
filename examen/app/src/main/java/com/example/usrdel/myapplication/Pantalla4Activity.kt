package com.example.usrdel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_pantalla4.*

class Pantalla4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla4)

        var datos = ArrayList<String>()
        //val lista = lista_dynamic

        datos.add("Datos Registrados");


        val adapterUser = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos)
        lista.adapter = adapterUser

        but_guardarLista.setOnClickListener {

            this.irPantallaLista()

            var nombre = nombre.getText().toString()
            var email = telefono.getText().toString()
            var phone = numeroCasa.getText().toString()





        }
    }
    fun irPantallaLista(){
        val intentIrPantallaLista = Intent(this,ListaActivity::class.java)
        startActivity(intentIrPantallaLista)

    }


}
