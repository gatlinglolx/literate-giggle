package selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class YellowDuckPage extends TestBase{
    private static By yellowDuckImg = By.cssSelector("img[alt='Yellow Duck']");

    public static void assertSuccessYellowDuckSearch() {
        $(yellowDuckImg).shouldBe(visible);
    }
}
