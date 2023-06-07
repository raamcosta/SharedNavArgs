package com.example.sharednavargs

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph
@NavGraph
annotation class SharedNavGraph(
    val start: Boolean = false
)