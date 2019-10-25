package jdisite.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import jdisite.entities.ContactInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.String.valueOf;
import static org.testng.Assert.assertEquals;

public class ShortContactForm {
    @UI("#contact-form #name") WebElement nameTextField;
    @UI("#last-name") WebElement lastNameTextField;
    @UI("#position") WebElement positionTextField;
    @UI("#passport-number") WebElement passportNumberTextField;
    @UI("#passport-seria") WebElement passportSeriaTextField;
    // Dropdown
    @UI("#gender") WebElement gender;
    private Select gender() { return new Select(gender); }
    // Combobox
    @UI("#religion") WebElement religion;
    // MultiDropdown
    @UI("#weather .caret") WebElement weatherExpand;
    @UI("#weather label") List<WebElement> weatherList;
    @UI("#weather button") WebElement weatherValue;
    @UI("#weather ul") WebElement weatherIsExpanded;
    private boolean weatherIsExpanded() {
        return weatherIsExpanded.getAttribute("style").equals("display: block;");
    }
    private void selectWeather(String value) {
        if (!weatherIsExpanded())
            weatherExpand.click();
        String[] values = value.split(", ");
        for (String val : values) {
            for (WebElement listOption : weatherList) {
                if (listOption.getText().trim().equals(val))
                    listOption.click();
            }
        }
    }
    @UI("#accept-conditions") WebElement acceptConditionsCheckbox;
    @UI("#passport") WebElement passportCheckbox;
    @UI("#description") WebElement descriptionText;
    @UI("#contact-form [type=submit]") WebElement submitButton;
    private void clearInput(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
    public void submit(ContactInfo contact) {
        clearInput(nameTextField, contact.name);
        clearInput(lastNameTextField, contact.lastName);
        clearInput(positionTextField, contact.position);
        clearInput(passportNumberTextField, valueOf(contact.passportNumber));
        clearInput(passportSeriaTextField, valueOf(contact.passportSeria));
        gender().selectByVisibleText(contact.gender);
        clearInput(religion, contact.religion);
        selectWeather(contact.weather);
        if (contact.passport && !passportCheckbox.isSelected() ||
                !contact.passport && passportCheckbox.isSelected())
            passportCheckbox.click();
        if (contact.acceptConditions && !acceptConditionsCheckbox.isSelected() ||
                !contact.acceptConditions && acceptConditionsCheckbox.isSelected())
            acceptConditionsCheckbox.click();
        clearInput(descriptionText, contact.description);
        submitButton.click();
    }
    public void check(ContactInfo contact) {
        assertEquals(nameTextField.getAttribute("value"), contact.name);
        assertEquals(lastNameTextField.getAttribute("value"), contact.lastName);
        assertEquals(positionTextField.getAttribute("value"), contact.position);
        assertEquals(passportNumberTextField.getAttribute("value"), valueOf(contact.passportNumber));
        assertEquals(passportSeriaTextField.getAttribute("value"), valueOf(contact.passportSeria));
        assertEquals(gender().getFirstSelectedOption().getText(), contact.gender);
        assertEquals(religion.getAttribute("value"), contact.religion);
        assertEquals(weatherValue.getText(), contact.weather);
        assertEquals(passportCheckbox.isSelected(), contact.passport);
        assertEquals(acceptConditionsCheckbox.isSelected(), contact.acceptConditions);
        assertEquals(descriptionText.getAttribute("value"), contact.description);
    }
}