package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class RadioButtonField extends BasePage {
    private By radioButtonField = By.id("item-2");
    private By confirmationMessageForRadioButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");

    public RadioButtonField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getRadioButtonYes() {
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
    }

    public WebElement getRadioButtonImpressive() {
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
    }

    public WebElement getRadioButtonNo() {
        return getDriver().findElement(By.id("noRadio"));
    }

    public void clickOnRadioButtonField() {
        openElementsPage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)", "");
        getDriver().findElement(radioButtonField).click();
    }

    public void clickOnYesButton() {
        getRadioButtonYes().click();
    }

    public void clickOnImpressiveButton() {
        getRadioButtonImpressive().click();
    }

    public boolean isYesButtonSelected() {
        return getRadioButtonYes().isSelected();
    }

    public boolean isImpressiveButtonSelected() {
        return getRadioButtonImpressive().isSelected();
    }

    public boolean isNoButtonEnabled() {
        return getRadioButtonNo().isEnabled();
    }

    public String confirmationMessageForRadioButton() {
        return getDriver().findElement(confirmationMessageForRadioButton).getText();
    }
}
