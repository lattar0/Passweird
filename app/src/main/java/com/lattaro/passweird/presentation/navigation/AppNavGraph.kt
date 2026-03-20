package com.lattaro.passweird.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lattaro.passweird.presentation.form.PasswordFormScreen
import com.lattaro.passweird.presentation.list.PasswordListScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.DASHBOARD) {
        composable(Routes.DASHBOARD) { PasswordListScreen(
            onNavigateToPasswordForm = { navController.navigate(Routes.PASSWORD_FORM) }
        ) }
        composable(Routes.PASSWORD_FORM) { PasswordFormScreen(
            onNavigateToPasswordList = { navController.navigate(Routes.DASHBOARD) }
        ) }
    }
}
