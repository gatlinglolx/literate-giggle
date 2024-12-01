//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//public class FirstTest {
//
//    //added comment for PR
//    @Test
//    public void getAllLinksAsList() {
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//
//        driver.get("https://the-internet.herokuapp.com/");
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//
//        for (WebElement link : links) {
//            String url = link.getAttribute("href");
//            System.out.println(url);
//        }
//
//        links.get(10).click();
//
//        driver.quit();
//    }
//}
