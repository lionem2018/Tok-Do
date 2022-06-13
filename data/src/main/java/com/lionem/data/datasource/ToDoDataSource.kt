package com.lionem.data.datasource

import com.lionem.data.model.ToDoEntity
import java.util.Date

interface ToDoDataSource {
    suspend fun insertToDo(toDoEntity: ToDoEntity)
    suspend fun getToDoListByDate(date: Date): List<ToDoEntity>
    suspend fun getAllToDo(): List<ToDoEntity>
}