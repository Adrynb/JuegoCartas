package com.example.juegocartas

class CardListener {
    companion object {
        fun onCardClicked(item: Item) {
            // Lógica a ejecutar cuando se hace clic en una carta
        }

        fun onMatched() {
            // Lógica a ejecutar cuando se encuentra una coincidencia
        }

        fun onMismatched() {
            // Lógica a ejecutar cuando no hay coincidencia
        }

        fun onGameFinished() {
            // Lógica a ejecutar cuando se termina el juego
        }

    }
}
