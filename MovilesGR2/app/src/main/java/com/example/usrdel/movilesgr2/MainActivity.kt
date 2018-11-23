package com.example.usrdel.movilesgr2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listadinamic: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listadinamic = findViewById(R.id.list_dynamic)

        val cursos = arrayOf("REDES", "FISICA", "PROGRA")
        listadinamic.adapter = ArrayAdapter<String>(this,android.R.layout.activity_list_item,cursos)

        listadinamic.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(applicationContext,"El curso escogido fue"+cursos[i],Toast.LENGTH_LONG)

        }
    }
}
