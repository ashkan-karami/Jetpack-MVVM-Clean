package com.sample.jetpack_mvvm_clean

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.junit4.createComposeRule
import com.sample.jetpack_mvvm_clean.ui.theme.JetpackMVVMCleanTheme
import org.junit.Rule

open class IndividualUITestParent {

    @get:Rule
    val rule = createComposeRule()

    protected fun setContent(composable: @Composable () -> Unit){
        rule.setContent {
            JetpackMVVMCleanTheme {
                composable()
            }
        }
    }
}