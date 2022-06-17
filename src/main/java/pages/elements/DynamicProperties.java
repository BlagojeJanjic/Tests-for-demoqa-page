package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class DynamicProperties extends BasePage {
    private By dynamicPropertiesField = By.id("item-8");
    private By enableAfter = By.id("enableAfter");
    private By visibleAfter = By.id("visibleAfter");

    public DynamicProperties(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnDynamicPropertiesField() {
        openElementsPage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        getDriver().findElement(dynamicPropertiesField).click();
    }

    public boolean elementIsClickable() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(enableAfter));
        return getDriver().findElement(enableAfter).isEnabled();
    }

    public boolean elementIsVisible() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(visibleAfter));
        return getDriver().findElement(visibleAfter).isDisplayed();
    }
}
