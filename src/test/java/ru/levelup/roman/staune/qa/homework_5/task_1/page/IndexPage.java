package ru.levelup.roman.staune.qa.homework_5.task_1.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {
    @FindBy(css = "a[href*='login']")
    private WebElement loginButton;

    public LoginPage clickLogin() {
        loginButton.click();
        return new LoginPage();
    }
}
