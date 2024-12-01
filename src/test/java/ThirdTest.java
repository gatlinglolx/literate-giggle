//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class ThirdTest {
//
//    @Test
//    public void loginTest() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement loginField = driver.findElement(By.cssSelector("input[type='text']"));
//        loginField.sendKeys(ConfProperties.getProperty("login"));
//
//        WebElement passField = driver.findElement(By.cssSelector("input[type='password']"));
//        passField.sendKeys(ConfProperties.getProperty("password"));
//
//        WebElement loginBtn = driver.findElement(By.name("login"));
//        loginBtn.click();
//
//        String expectedConfritmationMessageText = "You are now logged in as Vladislav Shakhov.";
//        WebElement confrimationLoginMessage = driver.findElement(By.className("notice"));
//        String confrimationLoginMessageText = confrimationLoginMessage.getText();
//        Assert.assertEquals(confrimationLoginMessageText, expectedConfritmationMessageText);
//
//        driver.quit();
//    }
//
//    @Test
//    public void emptyCartMessageTest() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement cart = driver.findElement(By.cssSelector(".link[href='https://litecart.stqa.ru/en/checkout']"));
//        cart.click();
//
//        WebElement paragraphOnCartPage = driver.findElement(By.xpath("//*[text()='There are no items in your cart.']"));
//        String paragraphOnCartPageText = paragraphOnCartPage.getText();
//
//        Assert.assertTrue(paragraphOnCartPageText.contains("There are no items in your cart."));
//
//        driver.quit();
//    }
//
//    @Test
//    public void addingDuckToCartTest() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement purpleDuckCard = driver.findElement(By.cssSelector("#box-most-popular ul [href='https://litecart.stqa.ru/en/rubber-ducks-c-1/purple-duck-p-5']"));
//        purpleDuckCard.click();
//
//        WebElement addpurpleDuckToCartBtn = driver.findElement(By.name("add_cart_product"));
//        addpurpleDuckToCartBtn.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class='quantity']"), "1"));
//
//        WebElement quantityInCart = driver.findElement(By.xpath("//span[@class='quantity']"));
//        String quantityInCartText = quantityInCart.getText();
//        Assert.assertTrue(quantityInCartText.contains("1"));
//
//        driver.quit();
//    }
//
//    @Test
//    public void purpleDuckCardCheckoutTest() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement rubberDucks = driver.findElement(By.cssSelector("li.general-0>a"));
//        rubberDucks.click();
//
//        WebElement purpleDuckImage = driver.findElement(By.cssSelector(".image[alt='Purple Duck']"));
//
//        Assert.assertTrue(purpleDuckImage.isDisplayed());
//
//        driver.quit();
//    }
//
//    @Test
//    public void yellowDuckSearchTest() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement searchField = driver.findElement(By.cssSelector("input[type='search']"));
//        searchField.sendKeys(ConfProperties.getProperty("search"));
//
//        Actions actions = new Actions(driver);
//        actions.sendKeys(searchField, Keys.ENTER).perform();
//
//        WebElement yellowDuckImg = driver.findElement(By.cssSelector("img[alt='Yellow Duck']"));
//
//        Assert.assertTrue(yellowDuckImg.isDisplayed());
//
//        driver.quit();
//    }
//
//    @Test
//    public void recentlyViewDuckDisplayTest() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://litecart.stqa.ru/en/");
//
//        WebElement greenDuck = driver.findElement(By.cssSelector(".image[alt='Green Duck']"));
//        greenDuck.click();
//
//        WebElement recentlyViewedTitle = driver.findElement(By.cssSelector("#box-recently-viewed-products > h3"));
//        Assert.assertTrue(recentlyViewedTitle.isDisplayed());
//
//        WebElement greenDuckImgInRecentlyViewed = driver.findElement(By.cssSelector("img[src='/cache/53bc44cc19f39ed000223d99e6fc53d9fe030a59160x160_fwb.png']"));
//        Assert.assertTrue(greenDuckImgInRecentlyViewed.isDisplayed());
//
//        driver.quit();
//    }
//}
