package com.id.exercise_2_andre_eka_putra_s.ui.screen.content;

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.id.exercise_2_andre_eka_putra_s.ui.screen.state.MainViewModel
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Exercise2Andre_Eka_Putra_STheme
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Typography


@Composable
fun ViewContent(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    val uiState = viewModel.uiState.collectAsState()
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Text(text = uiState.value.displayValue, style = Typography.titleLarge.copy(
            color = Color.White, fontSize = 70.sp
        ), maxLines = 1, overflow = TextOverflow.Ellipsis)
    }
}

@Composable
@Preview
fun ShowViewContainerPreview() {
    Exercise2Andre_Eka_Putra_STheme {
        ViewContent()
    }
}
