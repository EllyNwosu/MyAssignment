package com.elijah.myassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elijah.myassignment.databinding.NameModelBinding

class LetterAdapter (val name: List<LetterModel>) : RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {


    class LetterViewHolder(val binding: NameModelBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(song: LetterModel) {
            binding.firstName.text = name.firstName
            binding.secondName.text = name.secondname

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val binding: NameModelBinding = NameModelBinding.bind().inflate(LayoutInflater.from(parent.context))
        return LetterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val firstName = name.get(position)
        holder.bind(firstName)
    }

    override fun getItemCount(): Int {
        return name.size
    }
}
}