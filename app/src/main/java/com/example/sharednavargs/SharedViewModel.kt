package com.example.sharednavargs

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {
    val id = savedStateHandle.navArgs<IdNavArgs>().id!!

    val title = mutableStateOf("some-id")

    init {
        println("ID = $id")
    }
}