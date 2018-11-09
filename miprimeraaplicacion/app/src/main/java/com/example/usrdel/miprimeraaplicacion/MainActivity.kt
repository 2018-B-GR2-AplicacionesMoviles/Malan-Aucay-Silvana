package com.example.usrdel.miprimeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Parcelable
import android.util.Log
import com.example.usrdel.a2018movilesgr2.ButtonActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton_navegar
            .setOnClickListener {
                /*
                Log.i("navegacion","Hola")
                Log.w("navegacion","Hola")
                Log.d("navegacion","Hola")
                Log.e("navegacion","Hola")
                Log.v("navegacion","Hola")
                */
                this.irAPantallaDeBotones()
            }
    }

    fun irAPantallaDeBotones() {
        // INTENT
        val intentIrABotones = Intent(this, ButtonActivity::class.java)
        intentIrABotones.putExtra("nombre","Silvana")
        intentIrABotones.putExtra("apellido","Malan")
        this.startActivity(intentIrABotones)
    }

}