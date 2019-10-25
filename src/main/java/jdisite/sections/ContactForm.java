package jdisite.sections;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.*;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import jdisite.elements.MultiDropdown;
import jdisite.entities.ContactInfo;

public class ContactForm extends Form<ContactInfo> {
    @UI("#contact-form #name") TextField name;
    @UI("#last-name") TextField lastName;
    @UI("#position") TextField position;
    @UI("#passport-number") TextField passportNumber;
    @UI("#passport-seria") TextField passportSeria;
    @UI("#gender") Dropdown gender;
    @UI("#religion") DataListOptions religion;
    @UI("#weather .caret") MultiDropdown weather;
    @UI("#accept-conditions") Checkbox acceptConditions;
    @UI("#passport") Checkbox passport;
    @UI("#description") TextArea description;
    @UI("#contact-form [type=submit]") Button submit;

}