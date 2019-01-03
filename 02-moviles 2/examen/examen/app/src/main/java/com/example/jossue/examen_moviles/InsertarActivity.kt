package com.example.jossue.examen_moviles

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_insertar.*

class InsertarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertar)

        button_guardar
            .setOnClickListener {
                this.devolverInsertar()
            }
    }
    fun devolverInsertar() {

        //val numeroCasa = id_txt.text.toString()
        //val descripcion = desc_txt.text.toString()
        //val m2 = m2_txt.text.toString()
        //val precio = precio_txt.text.toString()

        val idPaciente = id_txt.text.toString()
        val nombre = desc_txt.text.toString()
        val historial = m2_txt.text.toString()
        val medicacion = precio_txt.text.toString()

        val intentRespuesta = Intent()

        intentRespuesta.putExtra("idPaciente", idPaciente)
        intentRespuesta.putExtra("nombre", nombre)
        intentRespuesta.putExtra("historial", historial)
        intentRespuesta.putExtra("medicacion", medicacion)

        this.setResult(
            RESULT_OK,
            intentRespuesta
        )

        this.finish()


    }
}
