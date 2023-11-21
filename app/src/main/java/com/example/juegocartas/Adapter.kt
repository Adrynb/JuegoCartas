import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.juegocartas.CardListener
import com.example.juegocartas.CardViewHolder
import com.example.juegocartas.Item
import com.example.juegocartas.R
import com.example.juegocartas.State

class Adapter(private val context: Context, private val data: List<Item>) : RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = data[position]

        when (currentItem.state) {
            State.TAPADO -> {
                holder.imageView.setImageResource(R.drawable.poker_svgrepo_com)
                holder.textView.text = ""
            }
            State.ENCUBIERTO -> {
                holder.imageView.setImageResource(currentItem.imageResId)
                holder.textView.text = currentItem.name
            }
            State.ADIVINADO -> {
                // Aquí puedes decidir qué hacer cuando la carta ha sido adivinada
                // Puedes ocultar la carta o mostrar algún otro indicador.
            }
        }

        holder.itemView.setOnClickListener {
            CardListener.onCardClicked(currentItem)
        }
    }


    override fun getItemCount(): Int {
        return data.size
    }
}
