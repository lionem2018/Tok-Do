package com.lionem.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "keptToDo")
data class KeptToDo (
    @PrimaryKey(autoGenerate = true)
    val keptToDoId: Long,
    val title: String,
    val description: String? = null,
    val chipColor: String? = null
)