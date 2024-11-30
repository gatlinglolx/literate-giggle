package selenide;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends TestBase {
    private static By loginField = By.cssSelector("input[type='text']");
    private static By passField = By.cssSelector("input[type='password']");
    private static By loginBtn = By.name("login");
    private static By cart = By.cssSelector(".link[href='https://litecart.stqa.ru/en/checkout']");
    private static By searchField = By.cssSelector("input[type='search']");
    private static By purpleDuckCard = By.cssSelector("#box-most-popular [href='https://litecart.stqa.ru/en/rubber-ducks-c-1/purple-duck-p-5']");
    private static By greenDuck = By.cssSelector(".image[alt='Green Duck']");
    private static By recentlyViewedTitle = By.cssSelector("#box-recently-viewed-products>h3");
    private static By greenDuckImgInRecentlyViewed = By.cssSelector("img[src='/cache/53bc44cc19f39ed000223d99e6fc53d9fe030a59160x160_fwb.png']");

    public static void attemptLogin(String email, String password) {
        $(loginField).sendKeys(email);
        $(passField).sendKeys(password);
        $(loginBtn).click();
    }

    public static void cartCheckout() {
        $(cart).click();
    }

    public static void purpluDuckCardCheckout() {
        $(purpleDuckCard).click();
    }

    public static void yellowDuckSearch(String search) {
        WebElement searchFieldElement = $(searchField);
        searchFieldElement.sendKeys(search);
        searchFieldElement.sendKeys(Keys.ENTER);
    }

    public static void assertRecentlyViewdDuckSuccessDisplay() {
        $(greenDuck).click();
        $(recentlyViewedTitle).shouldBe(visible);
        $(greenDuckImgInRecentlyViewed).shouldBe(visible);
    }
}