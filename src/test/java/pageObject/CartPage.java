//package pageObject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//public class CartPage extends TestBase {
//    private By paragraphOnCartPage = By.xpath("//*[text()='There are no items in your cart.']");
//    private final WebDriver driver;
//
//    public CartPage(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public void assertEmptyCartMessage() {
//        String paragraphOnCartPageText = driver.findElement(paragraphOnCartPage).getText();
//        Assert.assertTrue(paragraphOnCartPageText.contains("There are no items in your cart."));
//    }
//}
