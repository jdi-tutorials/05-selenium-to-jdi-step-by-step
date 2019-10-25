package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import jdisite.sections.ContactForm;
import jdisite.sections.ShortContactForm;

@Url("/contacts.html") @Title("Contact Form")
public class ContactPage extends WebPage {
    public ContactForm contactForm;
    public ShortContactForm sContactForm;
}
