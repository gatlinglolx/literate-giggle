package pageObject;

import org.testng.annotations.Test;
import pageObject.LoginPage;

public class SearchTest extends TestBase {
    @Test
    public void yellowDuckSearchTest() {
        LoginPage loginPage = new LoginPage(driver);
        YellowDuckPage yellowDuckPage = new YellowDuckPage(driver);

        loginPage.yellowDuckSearch(ConfProperties.getProperty("search"));

        yellowDuckPage.assertSuccessYellowDuckSearch();
    }
}
