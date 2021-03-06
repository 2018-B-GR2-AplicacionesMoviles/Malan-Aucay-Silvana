/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

import java.util.Date

fun main(args: Array<String>){

    println("Hola mundo")

    // Int edad = 29;

    // Mutable -> Cambiarse / Reasignar

    var edad: Int = 29

    edad = 10

    // Inmutable -> No puede cambiarse / No se puede reasignar

    val edadInmutable:Int = 29


    // Duck Typing

    var curso = 101 // Inferi que es un Int

    curso = 102

    var nombre = "Adrian"

    var apellido = 'H'

    var casado = false

    var sueldo = 10.1

    var fechaNacimiento = Date()

    println(fechaNacimiento.toString())


    when(casado){
        false -> println("Feliz $nombre") // template strings
        true -> println("Triste ${nombre}") // template strings
        else -> {
            println("No me voy a ejecutar")
            println("Ni yo tampoco")
        }
    }

    var bono = if (casado) 1000.00 else 0.00

    val sueldoTotal = calcularSueldo(bono)
    println(sueldoTotal)

    val adrian = Usuario("Adrian","Eguez", "Sarzosa")
    println(adrian)

    println(BaseDeDatos.Usuarios)
    BaseDeDatos.agregarUsuario("Adrian"
    )
    println(BaseDeDatos.Usuarios)

}

fun calcularSueldo(bono: Double): Double{
    var sueldo = 800.00
    return sueldo + bono
}

fun saludar(): Unit{
    println("Hola mundo")
}

class Usuario(public var nombre:String){ // 1er constructor
    public var apellido: String? = null
    public var apellidoMaterno: String? = null

    constructor(vNombre:String,vApellido:String):this(vNombre){ // 2do
        this.apellido = vApellido;
    }

    constructor(vNombre:String,vApellido:String,vApellidoMaterno: String):this(vNombre){ // 2do
        this.apellido = vApellido
        apellidoMaterno = vApellidoMaterno
    }

    /*
    public var nombre:String
    constructor(vNombre: String){
        this.nombre = vNombre
        nombre = vNombre
    }
    */

    override fun toString(): String{
        val apellidoMayusculas = if(!apellido.isNullOrBlank()) this.apellido?.toUpperCase() else ""
        val apellidoMaternoMayusculas = if(!apellidoMaterno.isNullOrBlank()) this.apellidoMaterno?.toUpperCase() else ""
        return "Hola $nombre $apellidoMayusculas $apellidoMaternoMayusculas"
    }
}




open class Animal(var nombre:String){

}
class Tortuga(nombre: String, var pesoCaparazon:Double): Animal(nombre){

}

var animal = Animal("caballo")
var george = Tortuga( "george",  12.5)

class Ejemplo{



    constructor(nNombre:String){

        println ("estoy en el constructor")
    }
    init {
        println("estoy en el init")
    }
}
val ejemplo = Ejemplo (nNombre = "Adrian")

class BaseDeDatos{
    companion object {
        val Usuarios:ArrayList<String> = ArrayList()
        fun agregarUsuario(nombre: String){
            Usuarios.add(nombre)
        }
    }
}





















