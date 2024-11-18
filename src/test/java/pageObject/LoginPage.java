package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class LoginPage extends TestBase {
    private By loginField = By.cssSelector("input[type='text']");
    private By passField = By.cssSelector("input[type='password']");
    private By loginBtn = By.name("login");
    private By cart = By.cssSelector(".link[href='https://litecart.stqa.ru/en/checkout']");
    private By searchField = By.cssSelector("input[type='search']");
    private By purpleDuckCard = By.cssSelector("#box-most-popular [href='https://litecart.stqa.ru/en/rubber-ducks-c-1/purple-duck-p-5']");
    private By greenDuck = By.cssSelector(".image[alt='Green Duck']");
    private By recentlyViewedTitle = By.cssSelector("#box-recently-viewed-products>h3");
    private By greenDuckImgInRecentlyViewed = By.cssSelector("img[src='/cache/53bc44cc19f39ed000223d99e6fc53d9fe030a59160x160_fwb.png']");
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptLogin(String email, String password) {
        driver.findElement(loginField).sendKeys(email);
        driver.findElement(passField).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public void cartCheckout() {
        driver.findElement(cart).click();
    }

    public void purpluDuckCardCheckout() {
        driver.findElement(purpleDuckCard).click();
    }

    public void yellowDuckSearch(String search) {
        WebElement searchFieldElement = driver.findElement(searchField);
        searchFieldElement.sendKeys(search);
        searchFieldElement.sendKeys(Keys.ENTER);
    }

    public void assertRecentlyViewdDuckSuccessDisplay() {
        SoftAssert softAssert = new SoftAssert();
        driver.findElement(greenDuck).click();
        WebElement recentlyViewedTitleElement = driver.findElement(recentlyViewedTitle);
        softAssert.assertTrue(recentlyViewedTitleElement.isDisplayed());
        WebElement greenDuckImgInRecentlyViewedElement = driver.findElement(greenDuckImgInRecentlyViewed);
        softAssert.assertTrue(greenDuckImgInRecentlyViewedElement.isDisplayed());
        softAssert.assertAll();
    }
}