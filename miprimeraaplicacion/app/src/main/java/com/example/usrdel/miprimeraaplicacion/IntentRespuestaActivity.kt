package com.example.usrdel.miprimeraaplicacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_intent_respuesta.*

class IntentRespuestaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_respuesta)

        button_enviar_intent_respuesta.setOnClickListener { this.enviarIntentRespuesta() }


    }

    fun enviarIntentRespuesta(){
        val intentRespuesta = Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI)
        this.startActivityForResult(requestCode,resultCode,data)
    }
    override fun on
}
