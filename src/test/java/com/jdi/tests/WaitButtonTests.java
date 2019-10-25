package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.common.Alerts.validateAlert;
import static com.jdi.states.State.loggedIn;
import static jdisite.enums.MenuOptions.ElementsPacks;
import static jdisite.enums.MenuOptions.HTML5;
import static jdisite.pages.Html5Page.suspendButton;
import static jdisite.pages.JDISite.htmlPage;
import static jdisite.pages.JDISite.selectInMenu;
import static org.hamcrest.Matchers.is;

public class WaitButtonTests implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        selectInMenu(ElementsPacks);
        selectInMenu(HTML5);
    }
    @Test
    public void waitButtonTest() {
        htmlPage.checkOpened();
        suspendButton.click();
        validateAlert(is("Suspend button"));
    }
}
