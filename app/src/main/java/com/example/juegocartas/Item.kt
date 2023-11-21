package com.example.juegocartas

class Item (val id: Int,
val name: String,
val imageResId: Int,
val type: CategoryType,
var state: State = State.TAPADO)


