package com.example.usrdel.myapplication

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Usuario(public var nombre: String,
              var numeroCasa: Int,
              var telefono: Date,
              var numeroMedidor: Double) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readSerializable() as Date,
        parcel.readDouble()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeInt(numeroCasa)
        parcel.writeSerializable(telefono)
        parcel.writeDouble(numeroMedidor)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "${nombre}"
    }

    companion object CREATOR : Parcelable.Creator<Usuario> {
        override fun createFromParcel(parcel: Parcel): Usuario {
            return Usuario(parcel)
        }

        override fun newArray(size: Int): Array<Usuario?> {
            return arrayOfNulls(size)
        }
    }
}