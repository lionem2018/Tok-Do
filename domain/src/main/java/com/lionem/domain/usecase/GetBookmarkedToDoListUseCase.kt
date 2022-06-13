package com.lionem.domain.usecase

import com.lionem.domain.repository.ToDoRepository

class GetBookmarkedToDoListUseCase(
    private val toDoRepository: ToDoRepository
) {
    suspend fun invoke() = toDoRepository.getKeptToDoList()
}