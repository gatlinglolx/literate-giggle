package selenide;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeTest
    public void setUp() {
        Configuration.browser = CHROME;
        baseUrl = "https://litecart.stqa.ru/en/";
        Configuration.pageLoadTimeout = 5000;
        open(baseUrl);
    }
}
