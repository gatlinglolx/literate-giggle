package pageObject;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPage;

public class LoginTest extends TestBase {
    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.attemptLogin(ConfProperties.getProperty("login"), ConfProperties.getProperty("password"));

        homePage.assertSuccessLogin();
    }

    @Test
    public void recentlyViewDuckDisplayTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.assertRecentlyViewdDuckSuccessDisplay();
    }
}
