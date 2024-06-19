package com.id.exercise_2_andre_eka_putra_s.ui.components.button

import androidx.compose.ui.graphics.Color
import com.id.exercise_2_andre_eka_putra_s.ui.theme.gray
import com.id.exercise_2_andre_eka_putra_s.ui.theme.lightGray
import com.id.exercise_2_andre_eka_putra_s.ui.theme.yellowPrimary

data class ButtonModel(
    val text: String = "%",
    val textColor: Color = Color.White,
    val bgColor: Color = Color.Black,
    val buttonWeight: Float = 1f,
) {
    companion object {
        val zero = ButtonModel(
            text = "0", bgColor = gray, buttonWeight = 2f
        )
        val coma = ButtonModel(
            text = ",", bgColor = gray, buttonWeight = 1f
        )
        val one = ButtonModel(
            text = "1", bgColor = gray, buttonWeight = 1f
        )
        val two = ButtonModel(
            text = "2", bgColor = gray, buttonWeight = 1f
        )
        val three = ButtonModel(
            text = "3", bgColor = gray, buttonWeight = 1f
        )
        val four = ButtonModel(
            text = "4", bgColor = gray, buttonWeight = 1f
        )
        val five = ButtonModel(
            text = "5", bgColor = gray, buttonWeight = 1f
        )
        val six = ButtonModel(
            text = "6", bgColor = gray, buttonWeight = 1f
        )
        val seven = ButtonModel(
            text = "7", bgColor = gray, buttonWeight = 1f
        )
        val eight = ButtonModel(
            text = "8", bgColor = gray, buttonWeight = 1f
        )
        val nine = ButtonModel(
            text = "9", bgColor = gray, buttonWeight = 1f
        )

        val clear = ButtonModel(
            text = "C", bgColor = lightGray, buttonWeight = 2f
        )
        val percentage = ButtonModel(
            text = "%", bgColor = lightGray, buttonWeight = 1f
        )

        val divide = ButtonModel(
            text = "/", bgColor = yellowPrimary, buttonWeight = 1f
        )
        val times = ButtonModel(
            text = "*", bgColor = yellowPrimary, buttonWeight = 1f
        )
        val minus = ButtonModel(
            text = "-", bgColor = yellowPrimary, buttonWeight = 1f
        )
        val add = ButtonModel(
            text = "+", bgColor = yellowPrimary, buttonWeight = 1f
        )
        val equals = ButtonModel(
            text = "=", bgColor = yellowPrimary, buttonWeight = 1f
        )

    }
}
