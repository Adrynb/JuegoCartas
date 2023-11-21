import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.juegocartas.CardViewHolder
import com.example.juegocartas.Item
import com.example.juegocartas.R

class Adapter(private val context: Context, private val data: List<Item>) : RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = data[position]
        holder.imageView.setImageResource(currentItem.imageResId)
        holder.textView.text = currentItem.name
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
