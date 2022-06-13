package com.lionem.data.mapper

import com.lionem.data.model.ToDoEntity
import com.lionem.domain.model.ToDoItem

// data -> domain
fun mapperToToDo(toDoList: List<ToDoEntity>): List<ToDoItem> {
    return toDoList.toList().map {
        ToDoItem(
            it.id,
            it.date,
            it.title,
            it.description,
            it.chipColor
        )
    }
}

fun ToDoEntity.map() = ToDoItem(
    id,
    date,
    title,
    description,
    chipColor
)

// domain -> data
fun mapperToTextEntity(textItems: List<ToDoItem>): List<ToDoEntity> {
    return textItems.toList().map {
        ToDoEntity(
            it.id,
            it.date,
            it.title,
            it.description,
            it.chipColor
        )
    }
}
fun ToDoItem.map() = ToDoEntity(
    id,
    date,
    title,
    description,
    chipColor
)