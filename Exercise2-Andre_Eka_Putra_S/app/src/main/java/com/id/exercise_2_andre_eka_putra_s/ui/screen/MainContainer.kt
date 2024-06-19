package com.id.exercise_2_andre_eka_putra_s.ui.screen;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.id.exercise_2_andre_eka_putra_s.ui.screen.content.OperationContent
import com.id.exercise_2_andre_eka_putra_s.ui.screen.content.ViewContent
import com.id.exercise_2_andre_eka_putra_s.ui.screen.state.MainViewModel
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Exercise2Andre_Eka_Putra_STheme


@Composable
fun MainContainer(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    Column(
        modifier = modifier
            .background(Color.Black)
            .padding(horizontal = 16.dp)
            .padding(bottom = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        ViewContent(modifier = Modifier.weight(1f).padding(end = 15.dp, bottom = 15.dp), viewModel = viewModel)
        OperationContent(modifier = Modifier.weight(2f), viewModel = viewModel)
    }
}

@Composable
@Preview
fun ShowMainContainerPreview() {
    Exercise2Andre_Eka_Putra_STheme {
        MainContainer()
    }
}
