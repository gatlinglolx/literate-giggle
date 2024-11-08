import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest {

    @Test
    public void cartCheckout() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        WebElement cart = driver.findElement(By.cssSelector(".link[href='https://litecart.stqa.ru/en/checkout']"));
        cart.click();

        WebElement paragraphOnCartPage = driver.findElement(By.xpath("//*[text()='There are no items in your cart.']"));
        String paragraphOnCartPageText = paragraphOnCartPage.getText();

        Assert.assertTrue(paragraphOnCartPageText.contains("There are no items in your cart."));

        driver.quit();
    }

    @Test
    public void rubberDucksCheckout() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDucks = driver.findElement(By.cssSelector("li.general-0>a"));
        rubberDucks.click();

        WebElement purpleDuckImage = driver.findElement(By.cssSelector(".image[alt='Purple Duck']"));

        Assert.assertTrue(purpleDuckImage.isDisplayed());

        driver.quit();
    }

    @Test
    public void doubleClickActiontest() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");

        WebElement purpleDuckCard = driver.findElement(By.cssSelector("#box-most-popular ul [href='https://litecart.stqa.ru/en/rubber-ducks-c-1/purple-duck-p-5']"));
        purpleDuckCard.click();

        WebElement addpurpleDuckToCartBtn = driver.findElement(By.name("add_cart_product"));
        Actions builder = new Actions(driver);
        builder.doubleClick(addpurpleDuckToCartBtn).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class='quantity']"), "2"));

        WebElement quantityInCart = driver.findElement(By.xpath("//span[@class='quantity']"));
        String quantityInCartText = quantityInCart.getText();
        Assert.assertTrue(quantityInCartText.contains("2"));

        driver.quit();
    }
}
