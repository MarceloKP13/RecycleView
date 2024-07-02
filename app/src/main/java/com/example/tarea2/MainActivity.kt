package com.example.tarea2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarea2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var personaAdapter: PersonaAdapter
    private lateinit var personaList: MutableList<Persona>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        personaList = mutableListOf(
            Persona(1, "Kevin Marcelo Torres Pinza", 22, "soltero", "Cantidad de Hij@s: 0"),
            Persona(2, "Marío González", 35, "casado", "Cantidad de Hij@s: 3"),
            Persona(3, "Pedro Rodríguez", 42, "divorciado", "Cantidad de Hij@s: 1"),
            Persona(4, "Laura Martínez", 20, "soltera", "Cantidad de Hij@s: 0"),
            Persona(5, "Luis López", 29, "casado", "Cantidad de Hij@s: 2"),
            Persona(6, "Ana Pérez", 48, "viuda", "Cantidad de Hij@s: 4"),
            Persona(7, "Diego Sánchez", 35, "soltero", "Cantidad de Hij@s: 3"),
            Persona(8, "Carla Díaz", 23, "soltera", "Cantidad de Hij@s: 1"),
            Persona(9, "Juan Martínez", 30, "casado", "Cantidad de Hij@s: 2"),
            Persona(10, "María Rodríguez", 27, "casada", "Cantidad de Hij@s: 1"),
            Persona(11, "Pedro López", 45, "divorciado", "Cantidad de Hij@s: 3"),
            Persona(12, "Laura González", 22, "soltera", "Cantidad de Hij@s: 0"),
            Persona(13, "Luis Sánchez", 40, "soltero", "Cantidad de Hij@s: 2"),
            Persona(14, "Ana Díaz", 52, "viuda", "Cantidad de Hij@s: 5"),
            Persona(15, "Diego Pérez", 33, "soltero", "Cantidad de Hij@s: 2"),
            Persona(16, "Carla Rodríguez", 18, "soltera", "Cantidad de Hij@s: 0"),
            Persona(17, "Juan López", 26, "casado", "Cantidad de Hij@s: 1"),
            Persona(18, "María Martínez", 37, "casada", "Cantidad de Hij@s: 3"),
            Persona(19, "Pedro Sánchez", 50, "divorciado", "Cantidad de Hij@s: 4"),
            Persona(20, "Laura Díaz", 21, "soltera", "Cantidad de Hij@s: 0"),
        )

        personaAdapter = PersonaAdapter(personaList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = personaAdapter
    }
}