package selenide;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class YellowDuckPage extends TestBase{
    private static By yellowDuckImg = By.cssSelector("img[alt='Yellow Duck']");

    @Step("Check that searched duck is displayed")
    public static void assertSuccessYellowDuckSearch() {
        $(yellowDuckImg).shouldBe(visible);
    }
}
