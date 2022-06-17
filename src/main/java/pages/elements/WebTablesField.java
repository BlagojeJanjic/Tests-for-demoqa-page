package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.List;


public class WebTablesField extends BasePage {
    private By webTablesField = By.id("item-3");
    private By addNewRecordButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submitButton = By.id("submit");
    private By records = By.xpath("//div[@class=\"rt-tr -even\"]");

    public WebTablesField(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickOnWebTablesField() {
        openElementsPage();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        getDriver().findElement(webTablesField).click();
    }

    public void clickOnAddButton() {
        getDriver().findElement(addNewRecordButton).click();
    }

    public void addToTable(String name, String lastName, String email, String age, String salary, String department) {
        getDriver().findElement(this.firstName).sendKeys(name);
        getDriver().findElement(this.lastName).sendKeys(lastName);
        getDriver().findElement(this.email).sendKeys(email);
        getDriver().findElement(this.age).sendKeys(age);
        getDriver().findElement(this.salary).sendKeys(salary);
        getDriver().findElement(this.department).sendKeys(department);
    }

    public void clickSubmitButton() {
        getDriver().findElement(submitButton).click();
    }

    public String lastRecord() {
        List <WebElement> allRecords = getDriver().findElements(records);
        return allRecords.get(allRecords.size()-1).getText();
    }
}
