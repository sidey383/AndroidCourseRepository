package ru.sidey383.task2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.sidey383.task2.databinding.ItemBinding
import ru.sidey383.task2.placeholder.PlaceholderContent.PlaceholderItem

class MyItemRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.image.setImageResource(item.image)
        holder.author.setText(item.author)
        holder.song.setText(item.song)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val image: ImageView = binding.imageView
        val song: TextView = binding.itemNumber1
        val author: TextView = binding.itemNumber2

        override fun toString(): String {
            return  "ViewHolder(super=" + super.toString() + "song=$song, author=$author)"
        }


    }

}