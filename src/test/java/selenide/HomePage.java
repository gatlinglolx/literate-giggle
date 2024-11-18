package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends TestBase {
    private static By confrimationLoginMessage = By.className("notice");

    public static void assertSuccessLogin() {
        String expectedConfritmationMessageText = "You are now logged in as Vladislav Shakhov.";
        $(confrimationLoginMessage).shouldHave(Condition.text(expectedConfritmationMessageText));
    }
}
