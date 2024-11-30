package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends TestBase {
    private static By paragraphOnCartPage = By.xpath("//*[text()='There are no items in your cart.']");

    public static void assertEmptyCartMessage() {
        String expectedEmptyCartText = "There are no items in your cart.";
        $(paragraphOnCartPage).shouldHave(Condition.text(expectedEmptyCartText));
    }
}
