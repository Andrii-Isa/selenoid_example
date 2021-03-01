import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class MainPage {

    public static MainPage open() {
        Selenide.open("https://google.com.ua");
        return new MainPage();
    }
}
