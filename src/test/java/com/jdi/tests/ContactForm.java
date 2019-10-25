package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static com.jdi.test.data.DefaultDataProvider.FULL_CONTACT;
import static com.jdi.test.data.DefaultDataProvider.SIMPLE_CONTACT;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.*;
import static jdisite.pages.JDISite.*;

public class ContactForm implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        leftMenu.select(ContactForm);
    }

    @Test
    public void submitContactDataTest() {
        contactPage.checkOpened();
        contactForm.submit(FULL_CONTACT);
        contactForm.check(FULL_CONTACT);
    }
    @Test
    public void submitContactSimpleDataTest() {
        contactPage.checkOpened();
        contactForm.submit(SIMPLE_CONTACT);
        contactForm.check(SIMPLE_CONTACT);
    }

    @Test
    public void submitContactFormSimpleTest() {
        contactPage.checkOpened();
        sContactForm.submit(FULL_CONTACT);
        sContactForm.check(FULL_CONTACT);
    }
}
