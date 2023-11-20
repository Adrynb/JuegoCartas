package com.example.juegocartas

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<CardViewHolder>() {

    private lateinit var elements : ArrayList<Int>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}