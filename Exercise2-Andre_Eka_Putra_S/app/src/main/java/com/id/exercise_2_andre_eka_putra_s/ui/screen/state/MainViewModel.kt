package com.id.exercise_2_andre_eka_putra_s.ui.screen.state

import androidx.lifecycle.ViewModel
import com.id.exercise_2_andre_eka_putra_s.utils.Operations
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.getAndUpdate

class MainViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MainUIState())
    val uiState = _uiState.asStateFlow()

    private var isNewOperation = false

    fun clear() {
        _uiState.getAndUpdate {
            MainUIState()
        }
        isNewOperation = false
    }

    fun setNumberValue(value: String) {
        _uiState.getAndUpdate { it ->
            it.copy(
                displayValue = when {
                    isNewOperation -> value
                    it.displayValue == "0" && value != "," -> value
                    it.displayValue.contains(",") && value == "," -> it.displayValue
                    !it.displayValue.contains(",") && value == "," -> it.displayValue + value
                    else -> it.displayValue + value
                }
            )
        }
        isNewOperation = false
    }

    fun setOperation(operation: Operations) {
        _uiState.getAndUpdate {
            it.copy(
                operations = operation,
                firstNumber = it.displayValue.toDouble(),
                displayValue = it.displayValue
            )
        }
        isNewOperation = true
    }

    fun doOperations() {
        _uiState.getAndUpdate {
            val secondNumber = it.displayValue.toDouble()
            val result = when (it.operations) {
                Operations.ADD -> it.firstNumber + secondNumber
                Operations.SUBTRACTION -> it.firstNumber - secondNumber
                Operations.TIMES -> it.firstNumber * secondNumber
                Operations.DIVIDE -> if (secondNumber != 0.0) it.firstNumber / secondNumber else Double.NaN
                else -> 0.0
            }
            it.copy(
                displayValue = result.toString(),
                result = result.toString(),
                firstNumber = result,
                operations = Operations.NONE
            )
        }
        isNewOperation = true
    }

    fun percentage() {
        _uiState.getAndUpdate {
            it.copy(
                displayValue = (it.displayValue.toDouble() / 100).toString()
            )
        }
        isNewOperation = true
    }
}