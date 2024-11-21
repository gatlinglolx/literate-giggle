package selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends TestBase {
    private static By confrimationLoginMessage = By.className("notice");

    @Step("Check display of success login message")
    public static void assertSuccessLogin() {
        String expectedConfritmationMessageText = "You are now logged in as Vladislav Shakhov.";
        $(confrimationLoginMessage).shouldHave(Condition.text(expectedConfritmationMessageText));
    }
}
