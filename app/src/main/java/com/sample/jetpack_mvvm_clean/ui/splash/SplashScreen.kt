package com.sample.jetpack_mvvm_clean.ui.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ashkan.jetpackcomposetest.philipp.navigation.Screen


@Composable
fun SplashScreen(navController: NavController){
    val viewModel: SplashViewModel = hiltViewModel()
    GetSplashLoading(viewModel = viewModel)
    navController.navigate(Screen.LoginScreen.route)
}

@Composable
fun GetSplashLoading(viewModel: SplashViewModel){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp)
    ) {
        Button(
            onClick = {

            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = "Show details"
            )
        }
    }
}