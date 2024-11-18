import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends TestBase{
    private By confrimationLoginMessage = By.className("notice");
    private final WebDriver driver;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertSuccessLogin() {
        String expectedConfritmationMessageText = "You are now logged in as Vladislav Shakhov.";
        String confrimationLoginMessageText = driver.findElement(confrimationLoginMessage).getText();
        Assert.assertEquals(confrimationLoginMessageText, expectedConfritmationMessageText);
    }
}
