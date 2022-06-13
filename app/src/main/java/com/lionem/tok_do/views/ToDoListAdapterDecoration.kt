package com.lionem.tok_do.views

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ToDoListAdapterDecoration: RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val position = parent.getChildAdapterPosition(view)
        val count = state.itemCount
        val offset = OFFSET_TO_DO_ITEM

        when (position) {
            0 -> {
                outRect.top = offset
            }
            (count - 1) -> {
                outRect.bottom = offset
            }
            else -> {
                outRect.top = offset
                outRect.bottom = offset
            }
        }
    }

    companion object {
        const val OFFSET_TO_DO_ITEM = 6
    }
}