package com.example.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R

@Composable
fun JelloBaseButton(
    modifier: Modifier = Modifier,
    text: String = "Default Text",
    onClick: () -> Unit = {},
    enable: Boolean = true,
    shape: Shape = RoundedCornerShape(8.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Black,
        contentColor = Color.White
    )
) {
    Button(
        modifier = modifier,
        shape = shape,
        colors = colors,
        enabled = enable,
        onClick = { onClick() }
    ) {
        Text(text)
    }
}

@Preview(apiLevel = 34)
@Composable
fun JelloBaseButtonPreview() {
    JelloBaseButton()
}

@Composable
fun JelloIconBaseButton(
    modifier: Modifier = Modifier,
    text: String = "Default Text",
    onClick: () -> Unit = {},
    enable: Boolean = true,
    shape: Shape = RoundedCornerShape(8.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Black,
        contentColor = Color.White
    ),
    color: Color = Color.White,
    descriptionIcon: String = "Facebook",
    srcIcon: Int = R.drawable.ic_facebook
) {
    Button(
        modifier = modifier,
        shape = shape,
        colors = colors,
        enabled = enable,
        onClick = { onClick() }
    ) {
        Icon(
            painter = painterResource(
                id = srcIcon,),
            contentDescription = descriptionIcon,
            modifier = Modifier.size(24.dp),
            tint = color)

        Spacer(modifier = Modifier.width(8.dp))

        Text(text)
    }
}

@Preview(apiLevel = 34)
@Composable
fun JelloIconBaseButtonPreview() {
    JelloIconBaseButton()
}