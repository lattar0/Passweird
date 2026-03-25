package com.lattaro.passweird.presentation.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.lattaro.passweird.R
import com.lattaro.passweird.presentation.list.components.PasswordItem

@Composable
fun PasswordListScreen(
    viewModel: PasswordListViewModel = hiltViewModel(),
    onNavigateToPasswordForm: () -> Unit
) {
    val passwords by viewModel.passwords.collectAsState()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { onNavigateToPasswordForm() }) {
                Icon(painterResource(R.drawable.ic_add), contentDescription = "Add")
            }
        }

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Boa noite",
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp)

            LazyColumn {
                items(passwords) { password ->
                    PasswordItem(password)
                }
            }
        }
    }
}