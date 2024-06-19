package com.id.exercise_2_andre_eka_putra_s.ui.screen.content;

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.id.exercise_2_andre_eka_putra_s.ui.components.button.ButtonModel
import com.id.exercise_2_andre_eka_putra_s.ui.components.button.CalculatorButton
import com.id.exercise_2_andre_eka_putra_s.ui.screen.state.MainViewModel
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Exercise2Andre_Eka_Putra_STheme
import com.id.exercise_2_andre_eka_putra_s.utils.Operations


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun OperationContent(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val horizontalArrangement = Arrangement.spacedBy(10.dp)
    FlowColumn(
        modifier = modifier,
        maxItemsInEachColumn = 5,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            maxItemsInEachRow = 4,
            horizontalArrangement = horizontalArrangement
        ) {
            CalculatorButton(modifier = Modifier.weight(2f).clickable {
                viewModel.clear()
            }, buttonModel = ButtonModel.clear)
            CalculatorButton(modifier = Modifier.weight(1f)
                .clickable {
                    viewModel.percentage()
                }, buttonModel = ButtonModel.percentage)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setOperation(Operations.DIVIDE)
            }, buttonModel = ButtonModel.divide,
                isSelected = uiState.operations == Operations.DIVIDE)
        }
        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            maxItemsInEachRow = 4,
            horizontalArrangement = horizontalArrangement
        ) {
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("7")
            }, buttonModel = ButtonModel.seven)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("8")
            }, buttonModel = ButtonModel.eight)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("9")
            }, buttonModel = ButtonModel.nine)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setOperation(Operations.TIMES)
            }, buttonModel = ButtonModel.times,
                isSelected = uiState.operations == Operations.TIMES)
        }
        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            maxItemsInEachRow = 4,
            horizontalArrangement = horizontalArrangement
        ) {
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("4")
            }, buttonModel = ButtonModel.four)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("5")
            }, buttonModel = ButtonModel.five)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("6")
            }, buttonModel = ButtonModel.six)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setOperation(Operations.SUBTRACTION)
            }, buttonModel = ButtonModel.minus,
                isSelected = uiState.operations == Operations.SUBTRACTION)
        }
        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            maxItemsInEachRow = 4,
            horizontalArrangement = horizontalArrangement
        ) {
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("1")
            }, buttonModel = ButtonModel.one)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("2")
            }, buttonModel = ButtonModel.two)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue("3")
            }, buttonModel = ButtonModel.three)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setOperation(Operations.ADD)
            }, buttonModel = ButtonModel.add,
                isSelected = uiState.operations == Operations.ADD)
        }
        FlowRow(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            maxItemsInEachRow = 4,
            horizontalArrangement = horizontalArrangement
        ) {
            CalculatorButton(modifier = Modifier.weight(2f).clickable {
                viewModel.setNumberValue("0")
            }, buttonModel = ButtonModel.zero)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.setNumberValue(",")
            }, buttonModel = ButtonModel.coma)
            CalculatorButton(modifier = Modifier.weight(1f).clickable {
                viewModel.doOperations()
            }, buttonModel = ButtonModel.equals)
        }
    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowOperationContentPreview() {
    Exercise2Andre_Eka_Putra_STheme {
        OperationContent()
    }
}
