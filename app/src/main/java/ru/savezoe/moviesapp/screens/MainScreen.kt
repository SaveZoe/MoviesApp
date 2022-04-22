package ru.savezoe.moviesapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.savezoe.moviesapp.ui.theme.MoviesAppTheme

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "test")
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPrev() {
    MoviesAppTheme {
        MainScreen()
    }
}