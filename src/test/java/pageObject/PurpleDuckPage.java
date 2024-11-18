package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PurpleDuckPage extends TestBase {
    private By addpurpleDuckToCartBtn = By.name("add_cart_product");
    private By quantityInCart = By.xpath("//span[@class='quantity']");
    private final WebDriver driver;

    public PurpleDuckPage (WebDriver driver) {
        this.driver = driver;
    }

    public void assertSuccessItemsInCartChange() {
        driver.findElement(addpurpleDuckToCartBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class='quantity']"), "1"));
        String quantityInCartText = driver.findElement(quantityInCart).getText();
        Assert.assertTrue(quantityInCartText.contains("1"));
    }
}
