package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class ButtonsField extends BasePage {
    private By buttonsField = By.id("item-4");
    private By doubleClickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[1]/button\n");
    private By rightClickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/button\n");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By clickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/button\n");
    private By clickMessage = By.id("dynamicClickMessage");

    public ButtonsField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnButtonsField() {
        openElementsPage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        getDriver().findElement(buttonsField).click();
    }

    public WebElement getDoubleClickButton() {
        return getDriver().findElement(doubleClickButton);
    }

    public WebElement getRightClickButton() {
        return getDriver().findElement(rightClickButton);
    }

    public WebElement getClickButton() {
        return getDriver().findElement(clickButton);
    }

    public void doubleClickMe() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(doubleClickButton));
        new Actions(getDriver()).moveToElement(getDoubleClickButton()).doubleClick().perform();
    }

    public void rightClickMe() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(rightClickButton));
        new Actions(getDriver()).moveToElement(getRightClickButton()).contextClick().perform();
    }

    public void clickMe() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(clickButton));
        getClickButton().click();
    }

    public String confirmationMessageForDoubleClick() {
        return getDriver().findElement(doubleClickMessage).getText();
    }

    public String confirmationMessageForRightClick() {
        return getDriver().findElement(rightClickMessage).getText();
    }

    public String confirmationMessageForClick() {
        return getDriver().findElement(clickMessage).getText();
    }
}
