package com.id.exercise_2_andre_eka_putra_s.ui.components.button;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Exercise2Andre_Eka_Putra_STheme
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Typography


@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    buttonModel: ButtonModel = ButtonModel()
) {
    val bgColor = if (isSelected) buttonModel.textColor else buttonModel.bgColor
    val textColor = if (isSelected) buttonModel.bgColor else buttonModel.textColor

    Column(
        modifier = modifier
            .aspectRatio(buttonModel.buttonWeight)
            .clip(CircleShape)
            .background(bgColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = buttonModel.text,
            style = Typography.titleLarge.copy(color = textColor, fontSize = 30.sp))
    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ShowCalculatorButtonPreview() {
    Exercise2Andre_Eka_Putra_STheme {
        CalculatorButton()
    }
}
