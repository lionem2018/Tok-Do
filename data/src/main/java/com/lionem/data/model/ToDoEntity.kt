package com.lionem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "toDo")
data class ToDoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val date: Date,
    val title: String,
    val description: String? = null,
    val chipColor: String? = null
)