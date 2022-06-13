package com.lionem.domain.repository

import com.lionem.domain.model.ToDoItem
import java.util.*

interface ToDoRepository {
    suspend fun getToDoList(date: Date): List<ToDoItem>

    suspend fun getAllToDoList(): List<ToDoItem>

    suspend fun getKeptToDoList(): List<ToDoItem>
}