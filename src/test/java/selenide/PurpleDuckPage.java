package selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PurpleDuckPage extends TestBase {
    private static By addpurpleDuckToCartBtn = By.name("add_cart_product");
    private static By quantityInCart = By.xpath("//span[@class='quantity']");

    @Step("Check change of an amount of items in cart after adding duck to a cart")
    public static void assertSuccessItemsInCartChange() {
        $(addpurpleDuckToCartBtn).click();
        String quantityInCartExpectedText = "1";
        $(quantityInCart).shouldHave(Condition.text(quantityInCartExpectedText));
    }
}
