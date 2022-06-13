package com.lionem.data.repository

import com.lionem.data.datasource.ToDoDataSource
import com.lionem.data.mapper.mapperToToDo
import com.lionem.domain.model.ToDoItem
import com.lionem.domain.repository.ToDoRepository
import java.util.Date

class ToDoRepositoryImpl(
    private val toDoDataSource: ToDoDataSource
): ToDoRepository {
    override suspend fun getToDoList(date: Date): List<ToDoItem> {
        return emptyList()
    }

    override suspend fun getAllToDoList(): List<ToDoItem> = mapperToToDo(toDoDataSource.getAllToDo())

    override suspend fun getKeptToDoList(): List<ToDoItem> {
        return emptyList()
    }
}