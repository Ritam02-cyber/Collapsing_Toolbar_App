package com.example.collapsingtoolbarapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.collapsingtoolbarapp.R
import com.example.collapsingtoolbarapp.model.Resources

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Resources>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val textView2: TextView = view.findViewById(R.id.item_detail)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.textView2.text = context.resources.getString(item.stringResourceId2)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}