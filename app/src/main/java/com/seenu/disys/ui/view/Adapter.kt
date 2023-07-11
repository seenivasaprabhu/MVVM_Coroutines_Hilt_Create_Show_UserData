package com.seenu.disys.ui.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seenu.disys.R
import com.seenu.disys.data.entities.Data
import com.seenu.disys.databinding.ItemViewChildBinding

//Adapter class for records
class Adapter(context: Context?) : RecyclerView.Adapter<ViewHolder>() {

    private var items: ArrayList<Data> = ArrayList()
    private var context=context
    init {
        this.context=context
    }
	//set list to adapter
    fun setItems(items: List<Data>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
	// init layout using binding
        val binding: ItemViewChildBinding =
            ItemViewChildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(items[position],this.context)

}

class ViewHolder(private val itemBinding: ItemViewChildBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {

    private lateinit var item: Data
	// bind data to view
    fun bind(item: Data, context: Context?) {
        this.item = item
        itemBinding.item = this.item
        val nameString: String =
            this.item.name.substring(0, 1).toUpperCase() + this.item.name.substring(1).toLowerCase()

        itemBinding.name = nameString
        itemBinding.status = this.item.status.equals(context?.getString(R.string.status_active),true)
    }

}
