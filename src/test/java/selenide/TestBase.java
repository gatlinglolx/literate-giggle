package selenide;

import com.codeborne.selenide.Configuration;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.EDGE;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

@Listeners(ReportPortalTestNGListener.class)
public class TestBase {
    @BeforeMethod
    public void setUp() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(CHROME);
        //caps.setVersion("124.0.6367.78");
        caps.setPlatform(Platform.WINDOWS);
        Configuration.remote = "http://192.168.0.101:4444/wd/hub";
        Configuration.browserCapabilities = caps;
        baseUrl = "https://litecart.stqa.ru/en/";
        Configuration.pageLoadTimeout = 5000;
        open(baseUrl);
    }
}
