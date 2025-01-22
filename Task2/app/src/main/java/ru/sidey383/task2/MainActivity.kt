package ru.sidey383.task2

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ru.sidey383.task2.databinding.ItemListBinding
import ru.sidey383.task2.placeholder.PlaceholderContent


class MainActivity : Activity() {

    private lateinit var binding: ItemListBinding
    private lateinit var adapter: MyItemRecyclerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ItemListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        adapter = MyItemRecyclerViewAdapter(PlaceholderContent.ITEMS)

        binding.list.layoutManager = manager
        binding.list.adapter = adapter
    }
}