package com.example.sharednavargs

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(navArgsDelegate = IdNavArgs::class)
@Composable
fun Screen2(
    sharedVm: SharedViewModel,
    navArgs: IdNavArgs, // navArgs to be forwarded to next screen,
    navigator: DestinationsNavigator,
) {
    Box() {
        Text(sharedVm.title.value)
    }
}