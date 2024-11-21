package selenide;

import com.codeborne.selenide.Configuration;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

@Listeners(ReportPortalTestNGListener.class)
public class TestBase {
    @BeforeMethod
    public void setUp() {
        Configuration.browser = CHROME;
        baseUrl = "https://litecart.stqa.ru/en/";
        Configuration.pageLoadTimeout = 5000;
        open(baseUrl);
    }
}
