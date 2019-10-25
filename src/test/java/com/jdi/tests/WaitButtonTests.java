package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.common.Alerts.validateAlert;
import static com.jdi.states.State.loggedIn;
import static jdisite.enums.MenuOptions.*;
import static jdisite.pages.Html5Page.suspendButton;
import static jdisite.pages.JDISite.*;
import static org.hamcrest.Matchers.is;

public class WaitButtonTests implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        leftMenu.select(ElementsPacks, HTML5);
    }
    @Test
    public void waitButtonTest() {
        htmlPage.checkOpened();
        suspendButton.click();
        validateAlert(is("Suspend button"));
    }
}
