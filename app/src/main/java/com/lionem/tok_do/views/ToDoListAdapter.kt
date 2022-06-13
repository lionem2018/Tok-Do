package com.lionem.tok_do.views

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lionem.data.model.ToDoEntity

class ToDoListAdapter: RecyclerView.Adapter<ToDoListAdapter.ViewHolder>() {

    private val itemList: List<ToDoEntity> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ToDoItemView(parent.context))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size


    class ViewHolder(private val view: ToDoItemView): RecyclerView.ViewHolder(view) {
        fun bindData(data: ToDoEntity) {
            view.bindData(data)
        }
    }
}