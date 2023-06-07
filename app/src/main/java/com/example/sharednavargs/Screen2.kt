package com.example.sharednavargs

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination


@SharedNavGraph
@Destination
@Composable
fun Screen2(
    sharedVm: SharedViewModel,
) {
    Column {
        Text("id = \"${sharedVm.id}\"")
        Text(sharedVm.title.value)
    }
}