package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class TextBoxField extends BasePage {
    private By textBoxField = By.id("item-0");
    private By userName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By confirmationMessageForTextBox = By.xpath("//*[@id=\"output\"]/div");

    public TextBoxField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnTextBoxField() {
        openElementsPage();
        getDriver().findElement(textBoxField).click();
    }

    public void inputsForTextBox(String name, String email, String currentAddress, String permanentAddress) {
        getDriver().findElement(userName).sendKeys(name);
        getDriver().findElement(this.email).sendKeys(email);
        getDriver().findElement(this.currentAddress).sendKeys(currentAddress);
        getDriver().findElement(this.permanentAddress).sendKeys(permanentAddress);
    }

    public void clickSubmit() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(submitButton).click();
    }

    public String confirmationMessageForTextBox() {
        return getDriver().findElement(confirmationMessageForTextBox).getText();
    }

    public void inputForNameField(String name) {
        getDriver().findElement(userName).sendKeys(name);
    }

    public void inputForEmailField(String email) {
        getDriver().findElement(this.email).sendKeys(email);
    }

    public void inputForCurrentAddresField(String currentAddress) {
        getDriver().findElement(this.currentAddress).sendKeys(currentAddress);
    }

    public void inputForPermanentAddressField(String permanentAddress) {
        getDriver().findElement(this.permanentAddress).sendKeys(permanentAddress);
    }
}
