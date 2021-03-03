import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void setUp() {
        BasicConfigurator.configure();
        Configuration.baseUrl = "https://google.com.ua/";
        Configuration.browser = "SelenoidDriverProvider";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1600x1400";
    }

    protected LoginPage mainPage;
}
