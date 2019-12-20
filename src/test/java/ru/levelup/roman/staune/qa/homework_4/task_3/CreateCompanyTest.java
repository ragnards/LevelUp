package ru.levelup.roman.staune.qa.homework_4.task_3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.roman.staune.qa.homework_4.BaseTest;

public class CreateCompanyTest extends BaseTest {

    @Test
    public void testCreatingCompany() {
        // 1. Открыть тестовый сайт
        driver.get("http://users.bugred.ru/");
        // 2. Войти на сайт
        driver.findElement(By.cssSelector("a[href*='login']")).click();
        driver.findElement(By.name("login")).sendKeys("krev@et.ka");
        driver.findElement(By.xpath("//p[@class='lead']/..//input[@name='password']")).sendKeys("krevetka");
        driver.findElement(By.xpath("//p[@class='lead']/..//input[@type='submit']")).click();
        // 3. Нажать на кнопку "Компании"
        driver.findElement(By.cssSelector("a[href *= 'companys/index']")).click();
        // 4. Нажать на кнопку "Добавить компанию"
        //driver.findElement(By.linkText("Добавить компанию")).click();

        // Следующие два шага невозможно выполнить, т.к. форма добавления компании в данный момент не появляется
        // 5. Ввести данные в форму
        // 6. Нажать на кнопку "Добавить компанию"

        // 7. Выполнить выход из системы
        driver.findElement(By.cssSelector(".dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a[href *= 'logout']")).click();
    }
}
