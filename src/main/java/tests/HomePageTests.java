package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{
    @Test (priority = 1)
    public void elementsFieldTest() {
        getHomePage().clickOnElementsField();
        Assert.assertEquals(getHomePage().elementsPageTitle(), "Elements");
    }

    @Test (priority = 2)
    public void formsFieldTest() {
        getHomePage().clickOnFormsField();
        Assert.assertEquals(getHomePage().formsPageTitle(),"Forms");
    }

    @Test (priority = 3)
    public void alertsFieldTest() {
        getHomePage().clickOnAlertsField();
        Assert.assertEquals(getHomePage().alertsPageTitle(), "Alerts, Frame & Windows");
    }

    @Test (priority = 4)
    public void widgetsFieldTest() {
        getHomePage().clickOnWidgetsField();
        Assert.assertEquals(getHomePage().widgetsPageTitle(), "Widgets");
    }

    @Test (priority = 5)
    public void interactiosFieldTest() {
        getHomePage().clickOnInteractionsField();
        Assert.assertEquals(getHomePage().interactionsPageTitle(), "Interactions");
    }

    @Test (priority = 6)
    public void bookStoreFieldTest() {
        getHomePage().clickOnBookStoreField();
        Assert.assertEquals(getHomePage().bookStorePageTitle(), "Book Store");
    }
}
