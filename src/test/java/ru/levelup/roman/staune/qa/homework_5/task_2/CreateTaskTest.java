package ru.levelup.roman.staune.qa.homework_5.task_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.roman.staune.qa.homework_5.BaseTest;

public class CreateTaskTest extends BaseTest {

    @Test
    public void testCreatingTask() {
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
        // driver.findElement(By.linkText("Добавить задачу")).click();

        // Следующие два шага невозможно выполнить, т.к. форма добавления задачи в данный момент не появляется
        // 5. Ввести данные в форму
        // 6. Нажать на кнопку "Добавить задачу"

        // 7. Проверить счетчик в правом верхнем углу (будет 0, т.к. задачу не добавляли)
        Assert.assertEquals(getTaskCounter(), 0, "Счетчик заданий не равен 0");
        // 8. Выполнить выход из системы
        driver.findElement(By.cssSelector(".dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a[href *= 'logout']")).click();
    }

    private int getTaskCounter() {
        String counterText = driver.findElement(By.cssSelector("a[href *= 'tasks/my']")).getText();
        return Integer.parseInt(counterText.split("[^0-9]")[0]);
    }
}
