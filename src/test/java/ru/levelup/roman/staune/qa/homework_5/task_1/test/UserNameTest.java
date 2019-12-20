package ru.levelup.roman.staune.qa.homework_5.task_1.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.roman.staune.qa.homework_5.BaseTest;
import ru.levelup.roman.staune.qa.homework_5.task_1.page.IndexPage;
import ru.levelup.roman.staune.qa.homework_5.task_1.page.UsersPage;

public class UserNameTest extends BaseTest {

    @Test
    public void testUserName() {
        // 2. Проверить название сайта
        Assert.assertEquals(driver.getTitle(), "Users", "Название сайта не 'Users'");
        // 3. Войти на сайт
        new IndexPage()
                .clickLogin()
                .login("krev@et.ka", "krevetka");
        // 4. Проверить имя пользователя в правом верхнем углу
        UsersPage usersPage = new UsersPage();
        String userName = usersPage.getUserName();
        Assert.assertEquals(userName, "Креветка",
                "Имя пользователя не соответствует имени созданного пользователя");
        // 5. Выполнить выход из системы
        usersPage.logout();
    }
}
