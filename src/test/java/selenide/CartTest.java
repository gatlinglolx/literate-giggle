package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Epic("Cart tests")
@Feature("Cart page")
public class CartTest extends TestBase {

    @Story("Displaying message when cart is empty")
    @Description("When user checks out to an empty cart there's an empty cart message displaying")
    @Test
    public void emptyCartMessageTest() {
        LoginPage.cartCheckout();

        CartPage.assertEmptyCartMessage();
    }

    @Story("Changing amount of items in cart")
    @Description("When user adds duck to cart items in cart must change")
    @Test
    public void successAddingDuckToCartTest() {
        LoginPage.purpluDuckCardCheckout();

        PurpleDuckPage.assertSuccessItemsInCartChange();
    }
}
