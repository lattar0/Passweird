package com.lattaro.passweird.presentation.form

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.lattaro.passweird.R
import com.lattaro.passweird.presentation.form.components.PasswordInput
import com.lattaro.passweird.ui.theme.PassweirdTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PasswordFormScreen(
    viewModel: PasswordFormViewModel = hiltViewModel(),
    onNavigateToPasswordList: () -> Unit,
) {
    val state by viewModel.state.collectAsState()

    Scaffold(
        topBar =
            {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    title = {
                        Row {
                            Text(
                                text = stringResource(R.string.save_password),
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        }
                    },

                    navigationIcon = {
                        IconButton(
                            onClick = onNavigateToPasswordList
                        ) {
                            Icon(
                                painterResource(R.drawable.ic_arrow_left),
                                contentDescription = stringResource(R.string.back),
                            )
                        }
                    },
                )
            },

        floatingActionButton = {
            FloatingActionButton(onClick = { onNavigateToPasswordList() }) {
                Icon(painterResource(R.drawable.ic_arrow_back),
                    contentDescription = stringResource(R.string.back))
            }
        }
    ) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            PasswordInput(
                stringResource(R.string.description),
                value = state.description,
                onValueChange = { viewModel.onDescriptionChange(it) }
            )

            PasswordInput(
                stringResource(R.string.user),
                value = state.username,
                onValueChange = { viewModel.onUsernameChange(it) }
            )

            PasswordInput(
                stringResource(R.string.password),
                value = state.password,
                onValueChange = { viewModel.onPasswordChange(it) }
            )

            PasswordInput(
                stringResource(R.string.url),
                value = state.url,
                onValueChange = { viewModel.onUrlChange(it) }
            )

            Button(
                onClick = { viewModel.onSavePassword()},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 12.dp)
            ) {
                Text(
                    text = stringResource(R.string.save_password),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun PasswordFormScreenPreview() {
    PassweirdTheme {
        PasswordFormScreen(
            onNavigateToPasswordList = {}
        )
    }
}