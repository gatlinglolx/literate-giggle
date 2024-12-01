//package pageObject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//
//public class YellowDuckPage {
//    private By yellowDuckImg = By.cssSelector("img[alt='Yellow Duck']");
//    private final WebDriver driver;
//
//    public YellowDuckPage (WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void assertSuccessYellowDuckSearch() {
//        WebElement yellowDuckImgElement = driver.findElement(yellowDuckImg);
//        Assert.assertTrue(yellowDuckImgElement.isDisplayed());
//    }
//}
