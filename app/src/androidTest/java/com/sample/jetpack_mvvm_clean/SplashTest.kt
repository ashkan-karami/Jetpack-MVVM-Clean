import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.sample.jetpack_mvvm_clean.ui.splash.SplashScreenView
import com.sample.jetpack_mvvm_clean.ui.splash.SplashViewModel
import org.junit.Rule
import org.junit.Test

class SplashTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun showLoading(){
        rule.setContent { SplashScreenView() }

        rule.onNodeWithText("Please wait!!").assertExists()
        rule.onNodeWithText("Please wait!!").assertIsDisplayed()
        //rule.onNodeWithText("Login").assertIsDisplayed()
    }
}