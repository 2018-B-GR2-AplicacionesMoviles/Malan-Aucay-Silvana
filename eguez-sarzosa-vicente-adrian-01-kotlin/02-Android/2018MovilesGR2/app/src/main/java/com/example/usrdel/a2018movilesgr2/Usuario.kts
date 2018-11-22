package com.example.usrdel.a2018movilesgr2

import android.os.Parcelable

class Usuario(public var nombre:String,
              var edad:Int,
              var fechaNacimiento:Date):Parcelable{
    constructor(parcel:Parcel): this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readSerializable() as Date,
            parcel.readDouble ()){
    )



}