package com.lionem.tok_do

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lionem.data.model.ToDoEntity
import com.lionem.domain.usecase.GetToDoListUseCase

class MainViewModel(
    private val getToDoListUseCase: GetToDoListUseCase
): ViewModel() {
    private val toDoEntityList: MutableLiveData<List<ToDoEntity>> by lazy {
        MutableLiveData<List<ToDoEntity>>().also {
            loadToDoList()
        }
    }

    private fun loadToDoList() {

    }
}