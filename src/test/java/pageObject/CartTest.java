package pageObject;

import org.testng.annotations.Test;
import pageObject.CartPage;

public class CartTest extends TestBase {
    @Test
    public void emptyCartMessageTest() {
        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.cartCheckout();

        cartPage.assertEmptyCartMessage();
    }

    @Test
    public void addingDuckToCartTest() {
        LoginPage loginPage = new LoginPage(driver);
        PurpleDuckPage purpleDuckPage = new PurpleDuckPage(driver);

        loginPage.purpluDuckCardCheckout();

        purpleDuckPage.assertSuccessItemsInCartChange();
    }
}
