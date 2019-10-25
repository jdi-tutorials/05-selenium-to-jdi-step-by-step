package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import jdisite.sections.ContactForm;
import jdisite.sections.ShortContactForm;

import static jdisite.utils.DriverUtils.DRIVER;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static org.testng.Assert.assertEquals;

public class ContactPage extends WebPage {
    public static final String URL = "https://jdi-testing.github.io/jdi-light/contacts.html";
    public static final String TITLE = "Contact Form";
    public ContactForm contactForm;

    public static void CheckContactPageOpened() {
        assertEquals(DRIVER.getCurrentUrl(), ContactPage.URL);
        assertEquals(DRIVER.getTitle(), ContactPage.TITLE);
    }
    public ShortContactForm sContactForm;
}
