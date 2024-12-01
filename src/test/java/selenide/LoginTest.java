package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Epic("Authorization and Authentication")
@Feature("UI Login form")
public class LoginTest extends TestBase {

    @Story("Redirect to user home page upon login with correct credentials")
    @Description("When user enters the correct credentials user home page appears")
    @Test
    public void successLoginTest() {
        LoginPage.attemptLogin(ConfProperties.getProperty("login"), ConfProperties.getProperty("password"));

        HomePage.assertSuccessLogin();
    }

    @Story("Displaying recently viewed duck under recently viewed title")
    @Description("When user checks out to any Duck card it appears in recently viewed title on home page")
    @Test
    public void recentlyViewDuckDisplayTest() {
        LoginPage.assertRecentlyViewdDuckSuccessDisplay();
    }
}
