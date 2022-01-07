package com.ezatpanah.recyclerviewanimations

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter(private val items : MutableList<SampleModel>) : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = items.size

    class ViewHolder(menuView : View) : RecyclerView.ViewHolder(menuView) {

        fun bind(item : SampleModel){

        }

    }


}
