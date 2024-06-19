package com.id.exercise_2_andre_eka_putra_s

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.id.exercise_2_andre_eka_putra_s.ui.screen.MainContainer
import com.id.exercise_2_andre_eka_putra_s.ui.theme.Exercise2Andre_Eka_Putra_STheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercise2Andre_Eka_Putra_STheme {
                MainContainer()
            }
        }
    }
}
