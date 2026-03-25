package com.lattaro.passweird.presentation.form.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PasswordInput(
    text: String
) {
    OutlinedTextField(
        state = rememberTextFieldState(),
        label = {
            Text(text)
        },
        modifier = Modifier
            .fillMaxWidth()
    )
}