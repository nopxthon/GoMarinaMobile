package com.nopx.gomarinamobile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nopx.gomarinamobile.component.BerandaContent
import com.nopx.gomarinamobile.component.TopBar

@Composable
fun Beranda (modifier: Modifier = Modifier) {
    Column {
        TopBar()
        BerandaContent()
    }
}

@Preview (showBackground = true)
@Composable
private fun BerandaPrev() {
    Beranda()
}