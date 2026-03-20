package com.lattaro.passweird

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lattaro.passweird.presentation.navigation.AppNavGraph
import com.lattaro.passweird.ui.theme.PassweirdTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PassweirdTheme {
                AppNavGraph()
            }
        }
    }
}
