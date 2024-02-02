import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import com.sample.jetpack_mvvm_clean.IndividualUITestParent
import com.sample.jetpack_mvvm_clean.ui.splash.SplashScreenView
import com.sample.jetpack_mvvm_clean.ui.splash.SplashViewModel
import org.junit.Test

class SplashTest: IndividualUITestParent() {

    private val mockViewModel: SplashViewModel = SplashViewModel()

    @Test
    fun showLoading(){
        setContent {
            SplashScreenView(mockViewModel)
        }

        rule.onNodeWithText("Splash Screen...").assertExists()
        rule.onNodeWithText("Splash Screen...").assertIsDisplayed()
        rule.onNodeWithTag("SplashProgress").assertIsDisplayed()

        // For click
        //rule.onNodeWithText("Continue").performClick()

        // Check number of matched nodes
//        rule.onAllNodesWithContentDescription("Text").assertCountEquals(4)

        // At least one matches
//        rule.onAllNodesWithContentDescription("Beatle").assertAny(hasTestTag("Drummer"))
    }

    //@Test
    //fun androidViewInteropTest() {
        // Check the initial state of a TextView that depends on a Compose state:
        //Espresso.onView(withText("Splash Screen...")).check(matches(isDisplayed()))
        // Check the new value
        //Espresso.onView(withText("Splash Screen...")).check(matches(isDisplayed()))
    //}
}