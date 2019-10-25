package jdisite.pages;

import jdisite.sections.ContactForm;
import jdisite.sections.ShortContactForm;

import static jdisite.utils.DriverUtils.DRIVER;
import static org.openqa.selenium.support.PageFactory.initElements;
import static org.testng.Assert.assertEquals;

public class ContactPage {
    public static final String URL = "https://jdi-testing.github.io/jdi-light/contacts.html";
    public static final String TITLE = "Contact Form";
    public ContactForm contactForm = initElements(DRIVER, ContactForm.class);

    public static void CheckContactPageOpened() {
        assertEquals(DRIVER.getCurrentUrl(), ContactPage.URL);
        assertEquals(DRIVER.getTitle(), ContactPage.TITLE);
    }
    public ShortContactForm sContactForm = initElements(DRIVER, ShortContactForm.class);
}
