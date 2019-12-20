package ru.levelup.roman.staune.qa.homework_5.task_1.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {
    @FindBy(css = ".dropdown-toggle")
    private WebElement userToggle;

    @FindBy(css = "a[href *= 'logout']")
    private WebElement logoutButton;

    public String getUserName() {
        return userToggle.getText();
    }

    public IndexPage logout() {
        if (!logoutButton.isDisplayed()) {
            userToggle.click();
        }
        logoutButton.click();
        return new IndexPage();
    }
}
