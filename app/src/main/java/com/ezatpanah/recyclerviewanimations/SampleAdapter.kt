package com.ezatpanah.recyclerviewanimations

import android.content.Context
import android.transition.Fade
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.*
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SampleAdapter(private val items: MutableList<SampleModel>) :
    RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    private val FADE_DURATION = 1000 //FADE_DURATION in milliseconds


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position]) // Set the view to fade in
        setScaleAnimation(holder.itemView)

    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvId = itemView.findViewById<TextView>(R.id.tvId)
        private val tvName = itemView.findViewById<TextView>(R.id.tvName)
        fun bind(item: SampleModel) {
            tvId.text = item.id.toString()
            tvName.text = item.name

        }

    }

    private fun setFadeAnimation(view: View) {
        val anim = AlphaAnimation(0.0f, 1.0f)
        anim.duration =FADE_DURATION.toLong()
        view.startAnimation(anim)
    }

    private fun setScaleAnimation(view: View) {
        val anim = ScaleAnimation(
            0.0f,
            1.0f,
            0.0f,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        anim.duration = FADE_DURATION.toLong()
        view.startAnimation(anim)
    }

}
