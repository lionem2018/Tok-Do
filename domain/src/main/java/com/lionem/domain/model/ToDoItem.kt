package com.lionem.domain.model

import java.util.*

data class ToDoItem(
    val id: Int = 0,
    val date: Date,
    val title: String,
    val description: String? = null,
    val chipColor: String? = null
)
