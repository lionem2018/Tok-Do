package com.lionem.tok_do.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.lionem.tok_do.databinding.ItemToDoListBinding
import com.lionem.data.model.ToDoEntity

class ToDoItemView constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = -1
): ConstraintLayout(context, attrs, defStyleAttr) {
    private var binding: ItemToDoListBinding? = ItemToDoListBinding.inflate(LayoutInflater.from(context))

    fun bindData(item: ToDoEntity) {

    }

}