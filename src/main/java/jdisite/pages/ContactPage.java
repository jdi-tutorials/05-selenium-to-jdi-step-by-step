package jdisite.pages;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import jdisite.entities.ContactInfo;
import jdisite.sections.ContactForm;

@Url("/contacts.html") @Title("Contact Form")
public class ContactPage extends WebPage {
    @UI("#contact-form") public static ContactForm contactForm;
    @UI("#contact-form") public static Form<ContactInfo> sContactForm;
}
