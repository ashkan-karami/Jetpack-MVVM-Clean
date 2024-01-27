package com.sample.jetpack_mvvm_clean.ui.navigation

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object LoginScreen: Screen("login_screen")
}
