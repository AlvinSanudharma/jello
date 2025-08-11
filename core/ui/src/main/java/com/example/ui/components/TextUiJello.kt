package com.example.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun JelloTextHeader(

) {
    Text(
        "Welcome to Login",
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            lineHeight = 24.sp,
            textAlign = TextAlign.Left
        )
    )
}

@Preview(apiLevel = 34)
@Composable
fun JelloTextHeaderPreview() {
    JelloTextHeader()
}