package com.lionem.data.datasource

import com.lionem.data.dao.ToDoDao
import com.lionem.data.model.ToDoEntity
import java.util.*

class ToDoDataSourceImpl(
    private val toDoDao: ToDoDao
): ToDoDataSource {
    override suspend fun insertToDo(toDoEntity: ToDoEntity) = toDoDao.insertToDo(toDoEntity)

    override suspend fun getToDoListByDate(date: Date) = toDoDao.getToDoListByDate(date)

    override suspend fun getAllToDo(): List<ToDoEntity> = toDoDao.getAllToDo()
}