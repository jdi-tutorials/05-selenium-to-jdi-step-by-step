package jdisite.sections;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import jdisite.elements.MultiDropdown;
import jdisite.entities.ContactInfo;

public class ContactForm extends Form<ContactInfo> {
    TextField name, lastName, position, passportNumber, passportSeria;
    Dropdown gender;
    DataListOptions religion;
    MultiDropdown weather;
    Checkbox acceptConditions, passport;
    TextArea description;
}