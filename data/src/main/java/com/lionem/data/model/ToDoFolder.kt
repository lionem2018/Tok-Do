package com.lionem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "toDoFolder")
data class ToDoFolder (
    @PrimaryKey(autoGenerate = true)
    val folderId: Long,
    val title: String,
    val deletable: Boolean
)