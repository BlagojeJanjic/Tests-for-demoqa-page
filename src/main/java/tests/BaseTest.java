package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.elements.*;
import pages.home.HomePage;

import java.time.Duration;
@Getter
public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private TextBoxField textBoxField;
    private CheckBoxField checkBoxField;
    private RadioButtonField radioButtonField;
    private WebTablesField webTablesField;
    private ButtonsField buttonsField;
    private LinksField linksField;
    private BrokenLinkImagesField brokenLinkImagesField;
    private DynamicProperties dynamicProperties;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        this.homePage = new HomePage(driver, driverWait);
        this.textBoxField = new TextBoxField(driver, driverWait);
        this.checkBoxField = new CheckBoxField(driver, driverWait);
        this.radioButtonField = new RadioButtonField(driver, driverWait);
        this.webTablesField = new WebTablesField(driver, driverWait);
        this.buttonsField = new ButtonsField(driver, driverWait);
        this.linksField = new LinksField(driver, driverWait);
        this.brokenLinkImagesField = new BrokenLinkImagesField(driver, driverWait);
        this.dynamicProperties = new DynamicProperties(driver, driverWait);
    }

    @AfterClass
    public void close() {
        driver.close();
    }

}
