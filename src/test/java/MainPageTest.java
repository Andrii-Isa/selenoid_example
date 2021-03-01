import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageTest extends BaseUITest {


    @Test
    public void testName() throws InterruptedException {
        MainPage.open();
        Thread.sleep(5000);
        $(".gLFyf.gsfi").shouldHave(appear).setValue("text");
        Thread.sleep(5000);
    }
}
