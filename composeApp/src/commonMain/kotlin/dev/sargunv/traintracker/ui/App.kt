package dev.sargunv.traintracker.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Preview
@Composable
fun App() {
    KoinContext {
        MaterialTheme(colorScheme = getColorScheme()) {
            MainScreen()
        }
    }
}

