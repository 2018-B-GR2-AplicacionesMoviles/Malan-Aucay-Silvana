package com.example.usrdel.a2018movilesgr2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.usrdel.miprimeraaplicacion.R
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    var nombre: String=""
    var apellido: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        this.capturarDatosIntent()
        act_but_nombre_apellido.text = "${nombre} ${apellido}"

        //but_but_intent_implicito.setOnClickListener(enviarIntentCorreo)

    }

    fun capturarDatosIntent(){
        this.nombre = intent.getStringExtra("nombre")

        this.apellido = intent.getStringExtra("apellido")

        fun enviarIntentCorreo(){

            val correo = text_correo.text
            val subject = text_subject.text
            val texto = texto_text.text

            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/html"

            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(correo,"s@s.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,subject)
            intent.putExtra(Intent.EXTRA_TEXT,texto)

            startActivity(intent)
        }

    }
}