package com.id.exercise_2_andre_eka_putra_s.ui.screen.state

import com.id.exercise_2_andre_eka_putra_s.utils.Operations

data class MainUIState(
    val firstNumber: Double = 0.0,
    val secondNumber: Double = 0.0,
    val operations: Operations = Operations.NONE,
    val result: String = "",
    val displayValue: String = "0",
    val replace: Boolean = false
)
