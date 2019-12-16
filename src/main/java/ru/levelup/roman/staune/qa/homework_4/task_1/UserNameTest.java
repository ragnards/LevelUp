package ru.levelup.roman.staune.qa.homework_4.task_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserNameTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSiteAndUserName() {
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

    @AfterClass
    public void tearDown() {
        // 6. Закрыть браузер
        driver.close();
    }
}
