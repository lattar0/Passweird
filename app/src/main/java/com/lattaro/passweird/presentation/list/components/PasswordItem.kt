package com.lattaro.passweird.presentation.list.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.lattaro.passweird.R
import com.lattaro.passweird.domain.model.Password

@Composable
fun PasswordItem(password: Password) {
    Row {
        Text(password.description)

        Row {
            Text("3 min atrás")

            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_right),
                    contentDescription = "Icone de flecha"
                )
            }
        }
    }
}