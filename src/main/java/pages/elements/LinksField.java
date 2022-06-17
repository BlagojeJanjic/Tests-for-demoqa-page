package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class LinksField extends BasePage {
    private By linksField = By.id("item-5");
    private By createdLink = By.id("created");
    private By linkResponse = By.id("linkResponse");

    public LinksField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnLinksField() {
        openElementsPage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(linksField).click();
    }

    public void clickOnCreatedLink() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(createdLink));
        getDriver().findElement(createdLink).click();
    }

    public String confirmationMessage() {
        return getDriver().findElement(linkResponse).getText();
    }
}
