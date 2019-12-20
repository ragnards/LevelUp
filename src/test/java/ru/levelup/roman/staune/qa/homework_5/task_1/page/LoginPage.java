package ru.levelup.roman.staune.qa.homework_5.task_1.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(name = "login")
    private WebElement loginInput;

    @FindBy(xpath = "//p[@class='lead']/..//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//p[@class='lead']/..//input[@type='submit']")
    private WebElement loginButton;

    public UsersPage login(String email, String password) {
        loginInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new UsersPage();
    }
}
