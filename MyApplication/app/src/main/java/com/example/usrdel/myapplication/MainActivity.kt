package com.example.usrdel.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navegar.setOnClickListener {
            Log.i("navegacion", "hola")
            Log.w("navegacion","hola")
            Log.d("navegacion", "hola")
            Log.e("navegacion","hola")
            Log.a("navegacion","hola")

    }
}
