package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Epic("Search tests")
@Feature("Search field")
public class SearchTest extends TestBase {

    @Story("Searching for a duck with a search field")
    @Description("When user enters existing duck name in search field end enters ENTER btn searched duck must appear")
    @Test(description="search for yellow duck")
    public void yellowDuckSearchTest() {
        LoginPage.yellowDuckSearch(ConfProperties.getProperty("search"));

        YellowDuckPage.assertSuccessYellowDuckSearch();
    }
}
