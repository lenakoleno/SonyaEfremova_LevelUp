package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import enums.ExistingUserEnum;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.MenuPage;
import utils.CommonUtils;

public class AuthorizationTest extends SeleniumBaseTest {
    private MenuPage menuPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
    }

    @Description(value = "test checking positive user login, clickable inbox button")
    @Test
    public void test_ID01_positiveCheckLoginExistingUser() {
        menuPage = loginPage.login(ExistingUserEnum.LENA_KOLENO.username, ExistingUserEnum.LENA_KOLENO.pass);
        assertTrue(
            CommonUtils.isClickable(driver, menuPage.inboxButton),
            "Проверка, что кнопка " + menuPage.inboxButton.getText() + " кликабельна.");
    }
}
