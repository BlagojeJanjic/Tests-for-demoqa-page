package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class BrokenLinkImagesField extends BasePage {
    private By brokenLinkField = By.id("item-6");
    private By validLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]");
    private By elementsField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");


    public BrokenLinkImagesField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnBrokenLinksField() {
        openElementsPage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(brokenLinkField).click();
    }

    public void clickForValidLink() {
        getDriver().findElement(validLink).click();
    }

    public boolean elementsToBeClickable() {
        return getDriver().findElement(elementsField).isEnabled();
    }
}
