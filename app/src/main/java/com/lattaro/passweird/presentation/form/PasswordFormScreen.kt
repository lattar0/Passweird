package com.lattaro.passweird.presentation.form

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.lattaro.passweird.R

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PasswordFormScreen(
    onNavigateToPasswordList: () -> Unit,
    viewModel: PasswordFormViewModel = hiltViewModel(),
    ) {

    val description by viewModel.description.collectAsState()
    val user by viewModel.user.collectAsState()
    val password by viewModel.password.collectAsState()

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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .padding(32.dp, 16.dp)

        ) {
            OutlinedTextField(
                value = "",
                label = { Text("Descrição") },
                modifier = Modifier
                    .fillMaxWidth(),
                onValueChange = {
                    viewModel.onDescriptionInputChange(it)
                }
            )

            OutlinedTextField(
                state = rememberTextFieldState(),
                label = { Text("Usuário") },
                modifier = Modifier
                    .fillMaxWidth()
            )

            OutlinedTextField(
                state = rememberTextFieldState(),
                label = { Text("Senha") },
                modifier = Modifier
                    .fillMaxWidth()
            )

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 16.dp)
            ) {
                Text("Salvar senha")
            }
        }

    }
}

@Preview
@Composable
fun PasswordFormScreenPreview() {
    PasswordFormScreen(
        onNavigateToPasswordList = {}
    )
}