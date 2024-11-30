package selenide;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void successLoginTest() {
        LoginPage.attemptLogin(ConfProperties.getProperty("login"), ConfProperties.getProperty("password"));

        HomePage.assertSuccessLogin();
    }

    @Test
    public void recentlyViewDuckDisplayTest() {
        LoginPage.assertRecentlyViewdDuckSuccessDisplay();
    }
}
