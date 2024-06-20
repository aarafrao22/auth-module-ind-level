package com.aaraf.authmoduleyt.presentation.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AuthButton(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    isLoading: Boolean,
    enabled: Boolean = true,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    Button(
        modifier = modifier,
        onClick = { onClick() },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor,
            disabledContentColor = backgroundColor,
            disabledContainerColor = contentColor
        ),
        shape = RoundedCornerShape(25.dp),
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                color = contentColor,
                modifier = Modifier.size(20.dp)
            )
        } else {
            Text(
                text = text,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun AuthButtonPreview() {
    AuthButton(
        text = "Login",
        backgroundColor = Color.Blue,
        contentColor = Color.White,
        isLoading = false,
        enabled = true,
        modifier = Modifier.fillMaxWidth(),
        onClick = { TODO() }
    )
}
