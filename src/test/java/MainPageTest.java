import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageTest extends BaseUITest {


    @Test
    public void testName() throws InterruptedException {
        mainPage.open()
                .fillInText();

        Thread.sleep(5000);

        Thread.sleep(5000);
    }
}
