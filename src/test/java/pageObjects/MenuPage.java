package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Входящие')]")
    public WebElement inboxButton;

    @FindBy(xpath = "//span[@class='compose-button__txt']")
    public WebElement writeLetterButton;

    public MenuPage(WebDriver driver) {
        super(driver);
        webDriverWait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Входящие')]")));
    }

}
