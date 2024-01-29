package com.sample.jetpack_mvvm_clean.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sample.jetpack_mvvm_clean.ui.login.LoginScreen
import com.sample.jetpack_mvvm_clean.ui.splash.SplashScreenView
import com.sample.jetpack_mvvm_clean.ui.splash.SplashViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(route = Screen.SplashScreen.route){
            SplashScreenView()
        }

        composable(route = Screen.LoginScreen.route){
            LoginScreen()
        }
    }
}