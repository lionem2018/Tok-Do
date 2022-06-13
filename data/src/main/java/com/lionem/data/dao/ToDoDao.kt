package com.lionem.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.lionem.data.model.ToDoEntity
import java.util.Date

@Dao
interface ToDoDao {
    @Query("SELECT * FROM toDo")
    suspend fun getAllToDo(): List<ToDoEntity>

    @Query("SELECT * FROM toDo WHERE todo.date = :date")
    suspend fun getToDoListByDate(date: Date): List<ToDoEntity>

    @Insert
    suspend fun insertToDo(toDoEntity: ToDoEntity)

}