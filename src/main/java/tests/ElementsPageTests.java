package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest{
    @Test
    public void verifyThatSubmitInTextBoxWorksWithCorrectInputs() {
        getTextBoxField().clickOnTextBoxField();
        getTextBoxField().inputsForTextBox("Blagoje Janjic", "blagoje@gmail.com", "Novi Sad", "Novi Sad");
        getTextBoxField().clickSubmit();
        Assert.assertEquals(getTextBoxField().confirmationMessageForTextBox(), "Name:Blagoje Janjic\n" + "Email:blagoje@gmail.com\n" + "Current Address :Novi Sad\n" + "Permananet Address :Novi Sad");
    }
    @Test
    public void verifyThatUserCanSubmitJustNameInTextBox() {
        getTextBoxField().clickOnTextBoxField();
        getTextBoxField().inputForNameField("Blagoje Janjic");
        getTextBoxField().clickSubmit();
        Assert.assertEquals(getTextBoxField().confirmationMessageForTextBox(), "Name:Blagoje Janjic");
    }
    @Test
    public void verifyThatUserCanSubmitJustEmailInTextBox() {
        getTextBoxField().clickOnTextBoxField();
        getTextBoxField().inputForEmailField("blagoje@gmail.com");
        getTextBoxField().clickSubmit();
        Assert.assertEquals(getTextBoxField().confirmationMessageForTextBox(), "Email:blagoje@gmail.com");
    }
    @Test
    public void verifyThatUserCanSubmitJustCurrentAddressInTextBox() {
        getTextBoxField().clickOnTextBoxField();
        getTextBoxField().inputForCurrentAddresField("Novi Sad");
        getTextBoxField().clickSubmit();
        Assert.assertEquals(getTextBoxField().confirmationMessageForTextBox(), "Current Address :Novi Sad");
    }
    @Test
    public void verifyThatUserCanSubmitJustPermanentAddressInTextBox() {
        getTextBoxField().clickOnTextBoxField();
        getTextBoxField().inputForPermanentAddressField("Novi Sad");
        getTextBoxField().clickSubmit();
        Assert.assertEquals(getTextBoxField().confirmationMessageForTextBox(), "Permananet Address :Novi Sad");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterClickOnCheckBox() {
        getCheckBoxField().clickOnCheckBoxField();
        getCheckBoxField().clickOnCheckBoxCommands();
        Assert.assertEquals(getCheckBoxField().confirmationMessageForCheckBox(), "You have selected :\n" + "commands");
        Assert.assertEquals(getCheckBoxField().getAttributeCommandsBox(), "rct-checkbox");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterClickOnHomeCheckBox() {
        getCheckBoxField().clickOnCheckBoxField();
        getCheckBoxField().clickOnHomeCheckBox();
        Assert.assertEquals(getCheckBoxField().confirmationMessageForHomeCheckBox(), "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterClickOnRadioButton() {
        getRadioButtonField().clickOnRadioButtonField();
        getRadioButtonField().clickOnYesButton();
        Assert.assertEquals(getRadioButtonField().confirmationMessageForRadioButton(), "You have selected Yes");
        Assert.assertFalse(getRadioButtonField().isImpressiveButtonSelected());
        getRadioButtonField().clickOnImpressiveButton();
        Assert.assertEquals(getRadioButtonField().confirmationMessageForRadioButton(), "You have selected Impressive");
        Assert.assertFalse(getRadioButtonField().isYesButtonSelected());
    }
    @Test
    public void verifyThatUserCanNotClickOnNoButton() {
        getRadioButtonField().clickOnRadioButtonField();
        Assert.assertFalse(getRadioButtonField().isNoButtonEnabled());
    }
    @Test
    public void verifyThatUserCanAddNewRecord() {
        getWebTablesField().clickOnWebTablesField();
        getWebTablesField().clickOnAddButton();
        getWebTablesField().addToTable("Blagoje", "Janjic", "blagoje@gmail.com", "25", "1000", "Insurance");
        getWebTablesField().clickSubmitButton();
        Assert.assertEquals(getWebTablesField().lastRecord(), "Blagoje\n" + "Janjic\n" + "25\n" + "blagoje@gmail.com\n" + "1000\n" + "Insurance");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterDoubleClick() {
        getButtonsField().clickOnButtonsField();
        getButtonsField().doubleClickMe();
        Assert.assertEquals(getButtonsField().confirmationMessageForDoubleClick(), "You have done a double click");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterRightClick() {
        getButtonsField().clickOnButtonsField();
        getButtonsField().rightClickMe();
        Assert.assertEquals(getButtonsField().confirmationMessageForRightClick(), "You have done a right click");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterClick() {
        getButtonsField().clickOnButtonsField();
        getButtonsField().clickMe();
        Assert.assertEquals(getButtonsField().confirmationMessageForClick(), "You have done a dynamic click");
    }
    @Test
    public void verifyThatUserGetConfirmationMessageAfterClickOnLink() {
        getLinksField().clickOnLinksField();
        getLinksField().clickOnCreatedLink();
        Assert.assertEquals(getLinksField().confirmationMessage(), "Link has responded with staus 201 and status text Created");
    }
    @Test
    public void verifyThatClickOnValidLinkWorks() {
        getBrokenLinkImagesField().clickOnBrokenLinksField();
        getBrokenLinkImagesField().clickForValidLink();
        Assert.assertTrue(getBrokenLinkImagesField().elementsToBeClickable());
    }
    @Test
    public void verifyThatIsButtonClickableAfterFiveSeconds() {
        getDynamicProperties().clickOnDynamicPropertiesField();
        Assert.assertTrue(getDynamicProperties().elementIsClickable());
        Assert.assertTrue(getDynamicProperties().elementIsVisible());
    }

}
