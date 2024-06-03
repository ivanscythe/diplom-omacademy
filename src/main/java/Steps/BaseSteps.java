package Steps;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseSteps {

    public void openMainURL() { open("https://omacademy.ru/"); }

    public void maximizeWindow() { getWebDriver().manage().window().maximize(); }

    public void switchToIframe() { switchTo().frame("blockrandom"); }

    public void switchToDefault() { switchTo().defaultContent(); }

}
