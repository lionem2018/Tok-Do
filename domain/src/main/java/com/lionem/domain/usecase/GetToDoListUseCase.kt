package com.lionem.domain.usecase

import com.lionem.domain.repository.ToDoRepository
import java.util.*

class GetToDoListUseCase(
    private val toDoRepository: ToDoRepository
) {
    suspend fun invoke(date: Date) = toDoRepository.getToDoList(date)
}