package ru.levelup.roman.staune.qa.homework_4.task_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateTaskTest {
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
        // 2. Войти на сайт
        driver.findElement(By.cssSelector("a[href*='login']")).click();
        driver.findElement(By.name("login")).sendKeys("krev@et.ka");
        driver.findElement(By.xpath("//p[@class='lead']/..//input[@name='password']")).sendKeys("krevetka");
        driver.findElement(By.xpath("//p[@class='lead']/..//input[@type='submit']")).click();
        // 3. Нажать на кнопку "Задачи"
        driver.findElement(By.cssSelector("a[href *= 'tasks/index']")).click();
        // 4. Нажать на кнопку "Добавить задачу"
        driver.findElement(By.linkText("Добавить задачу")).click();
        // 5. Ввести данные в форму

    }

    @AfterClass
    public void tearDown() {
        // 9. Закрыть браузер
        driver.close();
    }
}
