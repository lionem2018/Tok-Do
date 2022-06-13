package com.lionem.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class FolderWithToDoList (
    @Embedded
    val folder: ToDoFolder,
    @Relation(
        parentColumn = "folderId",
        entityColumn = "keptToDoId"
    )
    val toDoList: List<KeptToDo>
)