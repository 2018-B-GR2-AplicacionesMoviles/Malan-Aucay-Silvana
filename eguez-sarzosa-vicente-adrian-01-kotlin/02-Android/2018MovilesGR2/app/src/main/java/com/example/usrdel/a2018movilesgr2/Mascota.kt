package com.example.usrdel.a2018movilesgr2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_ciclo_vida.*

class Mascota(var nombre:String,
              var usuario:Usuario):Parcelable {
    constructor(parcel:Parcel): this(
            parcel.readString(),
            parcel.read
    )

              }