package ru.levelup.roman.staune.qa.homework_4.task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.roman.staune.qa.homework_4.BaseTest;

public class UserNameTest extends BaseTest {

    @Test
    public void testUserName() {
        // 1. Открыть тестовый сайт
        driver.get("http://users.bugred.ru/");
        // 2. Проверить название сайта
        Assert.assertEquals(driver.getTitle(), "Users", "Название сайта не 'Users'");
        // 3. Войти на сайт
        driver.findElement(By.cssSelector("a[href*='login']")).click();
        driver.findElement(By.name("login")).sendKeys("krev@et.ka");
        driver.findElement(By.xpath("//p[@class='lead']/..//input[@name='password']")).sendKeys("krevetka");
        driver.findElement(By.xpath("//p[@class='lead']/..//input[@type='submit']")).click();
        // 4. Проверить имя пользователя в правом верхнем углу
        WebElement userButton = driver.findElement(By.cssSelector(".dropdown-toggle"));
        Assert.assertEquals(userButton.getText(), "Креветка",
                "Имя пользователя не соответствует имени созданного пользователя");
        // 5. Выполнить выход из системы
        userButton.click();
        driver.findElement(By.cssSelector("a[href *= 'logout']")).click();
    }
}
