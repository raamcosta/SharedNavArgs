package com.example.sharednavargs

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class SharedViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {
    // TODO
    // try to get id from navArgs
    //private val id = savedStateHandle.navArgs<IdNavArgs>().id

    val title = mutableStateOf("some-id")
}