package com.example.usrdel.a2018movilesgr2
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        boton_siguiente
                .setOnClickListener {
                    /*
                    Log.i("navegacion","Hola")
                    Log.w("navegacion","Hola")
                    Log.d("navegacion","Hola")
                    Log.e("navegacion","Hola")
                    Log.v("navegacion","Hola")
                    */
                    this.irAPantallaFinal()
                }


    }
    fun irAPantallaFinal() {
        // INTENT
        val intentIrABotonfinal = Intent(this, ActivityFinal::class.java)
        this.startActivity(intentIrABotonfinal)
    }
}
