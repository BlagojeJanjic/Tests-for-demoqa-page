package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class CheckBoxField extends BasePage {
    private By checkBoxField = By.id("item-1");
    private By checkBoxHome = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label");
    private By checkBoxCommands = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]");
    private By confirmationMessageForCheckBox = By.xpath("//*[@id=\"result\"]");
    private By confirmationMessageForHomeCheckBox = By.id("result");

    public CheckBoxField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getexpandsCheckBox() {
        return getDriver().findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
    }

    public void clickOnCheckBoxField() {
        openElementsPage();
        getDriver().findElement(checkBoxField).click();
    }

    public void clickOnHomeCheckBox() {
        getDriver().findElement(checkBoxHome).click();
    }

    public String confirmationMessageForHomeCheckBox() {
        return getDriver().findElement(confirmationMessageForHomeCheckBox).getText();
    }

    public void clickOnCheckBoxCommands() {
        getexpandsCheckBox().click();
        getDriver().findElement(checkBoxCommands).click();
    }

    public String confirmationMessageForCheckBox() {
        return getDriver().findElement(confirmationMessageForCheckBox).getText();
    }

    public String getAttributeCommandsBox() {
        return getDriver().findElement(checkBoxCommands).getAttribute("class");
    }
}
