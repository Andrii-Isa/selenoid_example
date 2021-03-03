import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends MainPage<LoginPage> {

    private final String loginField = ".gLFyf.gsfi";

    public LoginPage open() {
        Selenide.open("https://google.com.ua");
        return this;
    }

    public void fillInText() {
        $(loginField).shouldHave(appear).setValue("text").pressEnter();
    }
}
