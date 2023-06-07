package com.example.sharednavargs

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.sharednavargs.destinations.Screen2Destination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@SharedNavGraph(start = true)
@Destination(navArgsDelegate = IdNavArgs::class)
@Composable
fun Screen1(
    sharedVm: SharedViewModel,
    navigator: DestinationsNavigator,
) {
    Box() {
        Text(sharedVm.title.value)
    }

    // navigate to screen 2 with and forward nav args
    Button(onClick = { navigator.navigate(Screen2Destination) }) {
        Text("To screen 2")
    }
}

data class IdNavArgs(val id: String?)