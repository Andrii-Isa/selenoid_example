import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseUITest {

    @Test
    public void testName() {
        mainPage.open()
                .fillInText();
        Selenide.sleep(5000);
    }
}
