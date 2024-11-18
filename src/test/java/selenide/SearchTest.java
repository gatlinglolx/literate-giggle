package selenide;

import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @Test
    public void yellowDuckSearchTest() {
        LoginPage.yellowDuckSearch(ConfProperties.getProperty("search"));

        YellowDuckPage.assertSuccessYellowDuckSearch();
    }
}
