package selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends TestBase {
    private static By paragraphOnCartPage = By.xpath("//*[text()='There are no items in your cart.']");

    @Step("Check display of an empty cart message")
    public static void assertEmptyCartMessage() {
        String expectedEmptyCartText = "There are no items in your cart.";
        $(paragraphOnCartPage).shouldHave(Condition.text(expectedEmptyCartText));
    }
}
