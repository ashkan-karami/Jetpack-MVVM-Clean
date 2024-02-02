package com.sample.jetpack_mvvm_clean.ui.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    // inject use-case / repository
): ViewModel() {

    fun check(){
        print("view model check hit!")
    }
}