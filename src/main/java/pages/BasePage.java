package pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
public class BasePage {
    private static final String DEMOQA_URL = "https://demoqa.com/";
    private static final String ELEMENTS_URL = "https://demoqa.com/elements";
    private static final String FORMS_URL = "https://demoqa.com/forms";
    private static final String ALERTS_URL = "https://demoqa.com/alertsWindows";
    private static final String WIDGETS_URL = "https://demoqa.com/widgets";
    private static final String INTERACTIONS_URL = "https://demoqa.com/interaction";
    private static final String BOOK_STORE_URL = "https://demoqa.com/books";

    private WebDriver driver;
    private WebDriverWait driverWait;

    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public void openHomePage() {
        driver.navigate().to(DEMOQA_URL);
    }

    public void openElementsPage() {
        driver.navigate().to(ELEMENTS_URL);
    }

    public void openAlertsPage() {
        driver.navigate().to(ALERTS_URL);
    }

}
