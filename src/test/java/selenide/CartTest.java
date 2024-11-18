package selenide;

import org.testng.annotations.Test;

public class CartTest extends TestBase {
    @Test
    public void emptyCartMessageTest() {
        LoginPage.cartCheckout();

        CartPage.assertEmptyCartMessage();
    }

    @Test
    public void addingDuckToCartTest() {
        LoginPage.purpluDuckCardCheckout();

        PurpleDuckPage.assertSuccessItemsInCartChange();
    }
}
