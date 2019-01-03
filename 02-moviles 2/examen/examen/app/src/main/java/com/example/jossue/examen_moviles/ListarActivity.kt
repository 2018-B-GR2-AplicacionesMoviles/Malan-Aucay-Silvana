package com.example.jossue.examen_moviles

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_listar.*

class ListarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        //val adaptadorCasa = ArrayAdapter<Casa>(
            //this, android.R.layout.simple_expandable_list_item_1, BDD.Casa)

        //list_casa.adapter = adaptadorCasa
        val adaptador = ArrayAdapter<Paciente>(this, android.R.layout.simple_expandable_list_item_1, Bdd2.Paciente)
        list_paciente.adapter = adaptador
        val intentEditar = Intent(this, EditarActivity::class.java)

        list_paciente
            .onItemClickListener =
                object : AdapterView.OnItemClickListener{
                    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                        val paciente = Bdd2.Paciente[position]
                        val pos = position
                        intentEditar.putExtra("paciente",paciente)
                        intentEditar.putExtra("pos", pos)
                        startActivity(intentEditar)

                    }
                }
    }
}
