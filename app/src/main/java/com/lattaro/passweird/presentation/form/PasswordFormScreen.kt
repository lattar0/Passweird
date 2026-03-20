package com.lattaro.passweird.presentation.form

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.lattaro.passweird.R

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PasswordFormScreen(
    onNavigateToPasswordList: () -> Unit
) {
    Scaffold(
        topBar =
            {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,

                        ) {
                            IconButton(
                                onClick = onNavigateToPasswordList
                            ) {
                                Icon(
                                    painterResource(R.drawable.ic_arrow_left),
                                    contentDescription = "Voltar",
                                )
                            }
                            Text("Criar senha")
                        }
                    }
                )
            },
    ) { innerPadding ->
        Text(
            text = "Usuário",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview
@Composable
fun PasswordFormScreenPreview() {
    PasswordFormScreen(
        onNavigateToPasswordList = {}
    )
}