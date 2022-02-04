package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.SleepUtil;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Имя ящика']")
    private WebElement enterLoginName;

    @FindBy(xpath = "//button[contains(text(),'Ввести пароль')]")
    private WebElement clickButtonLogin;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private WebElement enterPassword;

    @FindBy(xpath = "//button[@type='button'][contains(text(),'Войти')]")
    private WebElement clickEnterButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MenuPage login(String username, String password) {
        enterLoginName.sendKeys(username);
        enterLoginName.sendKeys(Keys.ENTER);
        SleepUtil.sleep(100);
        enterPassword.sendKeys(password);
        enterPassword.sendKeys(Keys.ENTER);
        return new MenuPage(driver);
    }
}
