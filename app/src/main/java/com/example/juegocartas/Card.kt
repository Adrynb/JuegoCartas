package com.example.juegocartas

import android.widget.ImageView

class Card {
    var cardID : Int = 99
    var estado : State = State.TAPADO
    var imageID : Int = R.layout.activity_main

    private companion object{
        var category = arrayOf(R.drawable.banana_blackbarry_blackberries_svgrepo_com,
            R.drawable.baseline_cancel_24,
            R.drawable.baseline_navigation_24,
            R.drawable.baseline_restart_alt_24,
            R.drawable.bear_svgrepo_com,
            R.drawable.bird_svgrepo_com,
            R.drawable.camel_svgrepo_com,
            R.drawable.cat_with_wry_smile_svgrepo_com,
            R.drawable.cerejas_cherries_cherry_svgrepo_com,
            R.drawable.crocodile_svgrepo_com,
            R.drawable.cupcake_svgrepo_com,
            R.drawable.dog_face_svgrepo_com,
            R.drawable.dolphin_svgrepo_com,
            R.drawable.donut_svgrepo_com,
            R.drawable.fruit_melancia_watermelon_svgrepo_com,
            R.drawable.hamburger_svgrepo_com,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,
            R.drawable.lion_svgrepo_com,
            R.drawable.mouse_svgrepo_com,
            R.drawable.orange_svgrepo_com,
            R.drawable.pizza_svgrepo_com,
            R.drawable.poker_svgrepo_com)
    }
}

