package com.example.sharednavargs

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.sharednavargs.destinations.Screen1Destination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun StartScreen(navigator: DestinationsNavigator) {
    Box {
        Button(onClick = { navigator.navigate(Screen1Destination("asdf")) }) {
            Text("Go to Screen 1")
        }
    }
}