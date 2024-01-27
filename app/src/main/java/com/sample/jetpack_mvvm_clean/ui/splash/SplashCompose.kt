package com.sample.jetpack_mvvm_clean.ui.splash

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun ShowSplash(){
    val viewModel: SplashViewModel = hiltViewModel()
    GetSplashLoading(viewModel = viewModel)
}

@Composable
fun GetSplashLoading(viewModel: SplashViewModel){

}