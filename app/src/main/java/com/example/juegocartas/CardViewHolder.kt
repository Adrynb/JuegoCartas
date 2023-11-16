package com.example.juegocartas

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    lateinit var image : ImageView
    lateinit var card: Card
}
