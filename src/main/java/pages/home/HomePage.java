package pages.home;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;


public class HomePage extends BasePage {
    private By elementsField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By elementsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By formsField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By formsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By alertsField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By alertsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By widgetsField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By widgetsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By interactionsField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By interactionsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By bookStoreField = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[1]");
    private By bookStoreTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");



    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnElementsField() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(elementsField).click();
    }

    public String elementsPageTitle() {
        return getDriver().findElement(elementsTitle).getText();
    }

    public void clickOnFormsField() {
        openHomePage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(formsField).click();
    }

    public String formsPageTitle() {
        return getDriver().findElement(formsTitle).getText();
    }

    public void clickOnAlertsField() {
        openHomePage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(alertsField).click();
    }

    public String alertsPageTitle() {
        return getDriver().findElement(alertsTitle).getText();
    }

    public void clickOnWidgetsField() {
        openHomePage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(widgetsField).click();
    }

    public String widgetsPageTitle() {
        return getDriver().findElement(widgetsTitle).getText();
    }

    public void clickOnInteractionsField() {
        openHomePage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        getDriver().findElement(interactionsField).click();
    }

    public String interactionsPageTitle() {
        return getDriver().findElement(interactionsTitle).getText();
    }

    public void clickOnBookStoreField() {
        openHomePage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        getDriver().findElement(bookStoreField).click();
    }

    public String bookStorePageTitle() {
        return getDriver().findElement(bookStoreTitle).getText();
    }
}
