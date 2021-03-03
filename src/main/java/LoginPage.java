import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import io.qameta.allure.Step;

public class LoginPage extends MainPage<LoginPage> {

    private final String loginField = ".gLFyf.gsfi";

    @Step("Navigate to the google page")
    public LoginPage open() {
        Selenide.open("https://google.com.ua");
        return this;
    }
    @Step("Input text text")
    public void fillInText() {
        $(loginField).shouldHave(appear).setValue("text").pressEnter();
    }
}
