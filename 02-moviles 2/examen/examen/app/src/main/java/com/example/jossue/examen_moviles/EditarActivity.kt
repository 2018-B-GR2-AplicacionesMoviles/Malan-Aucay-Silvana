package com.example.jossue.examen_moviles

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_editar.*

class EditarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar)

        //val casa = intent.getParcelableExtra<Casa?>("casa")
        //val pos = intent.getIntExtra("pos", 0)

        val paciente = intent.getParcelableExtra<Paciente>("paciente")
        val pos = intent.getIntExtra("pos", 0)
        if (paciente != null) {
            mostrarCampos(paciente)
        }

        Log.i("intent-nombre-apellido", "casa actualizar ${paciente.toString()}")

        button_actualizar.setOnClickListener {
            this.actualizarPaciente(id_editar.text.toString(), desc_editar.text.toString(), m2_editar.text.toString(), precio_editar.text.toString(), pos)

            this.irAListar()
        }
        button_eliminar.setOnClickListener {
            this.borrarPaciente(pos)
            this.irAListar()
        }
    }
    fun actualizarPaciente(idPaciente: String, nombre: String, historial: String, medicacion: String, pos: Int): Unit{
        val nuevoPaciente: Paciente = Paciente(idPaciente, nombre, historial, medicacion)
        Bdd2.Paciente[pos] = nuevoPaciente
    }

    fun irAListar(){
        val intentListar = Intent(this, ListarActivity::class.java);
        this.startActivity(intentListar)
    }
    fun borrarPaciente(pos: Int): Unit{
        Bdd2.Paciente.remove(Bdd2.Paciente[pos])
    }

    fun mostrarCampos(paciente: Paciente){
        id_editar.setText(paciente.idPaciente);
        desc_editar.setText(paciente.nombre);
        m2_editar.setText(paciente.historial);
        precio_editar.setText(paciente.medicacion);
    }

}
