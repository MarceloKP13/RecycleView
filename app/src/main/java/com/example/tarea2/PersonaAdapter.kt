package com.example.tarea2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea2.databinding.ItemPersonaBinding

class PersonaAdapter(private val personaList: List<Persona>) :
    RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val binding = ItemPersonaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = personaList[position]
        holder.bind(persona)
    }

    override fun getItemCount() = personaList.size

    class PersonaViewHolder(private val binding: ItemPersonaBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(persona: Persona) {
            binding.idTextView.text = persona.id.toString()
            binding.nombreTextView.text = persona.nombre
            binding.edadTextView.text = persona.edad.toString()
            binding.estadocivilTextView.text = persona.estadocivil
            binding.canthijosTextView.text = persona.canthijos.toString()
        }
    }
}