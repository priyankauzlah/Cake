package com.uzlah.cake

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uzlah.cake.databinding.ItemCakeBinding

class ListCakeAdapter(private val listCakeAdapter: ArrayList<Cake>) :

    RecyclerView.Adapter<ListCakeAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallBack

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallBack) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallBack {
        fun onItemClicked(cakes: Cake)
    }

    inner class ListViewHolder(var cakeBinding: ItemCakeBinding) :
        RecyclerView.ViewHolder(cakeBinding.root) {
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val cakeBinding =
            ItemCakeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(cakeBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val cake = listCakeAdapter[position]

        Glide.with(holder.itemView.context).load(cake.photo)
            .into(holder.cakeBinding.IvItemImage)
        holder.cakeBinding.TvItemTitle.text = cake.name
        holder.cakeBinding.TvPrice.text = cake.price

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listCakeAdapter[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listCakeAdapter.size
    }
}