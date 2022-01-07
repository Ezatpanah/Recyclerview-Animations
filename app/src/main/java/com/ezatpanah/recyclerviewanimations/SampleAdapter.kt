package com.ezatpanah.recyclerviewanimations

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter(private val items : MutableList<SampleModel>) : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_row,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        private  val tvId= itemView.findViewById<TextView>(R.id.tvId)
        private  val tvName= itemView.findViewById<TextView>(R.id.tvName)
        fun bind(item : SampleModel){
            tvId.text=item.id.toString()
            tvName.text=item.name

        }

    }


}
