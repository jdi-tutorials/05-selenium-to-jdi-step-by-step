package com.jdi.tests;

import com.epam.jdi.light.elements.common.Alerts;
import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.driver.WebDriverFactory.getDriver;
import static com.epam.jdi.light.elements.common.Alerts.*;
import static com.jdi.states.State.loggedIn;
import static jdisite.enums.MenuOptions.ElementsPacks;
import static jdisite.enums.MenuOptions.HTML5;
import static jdisite.pages.JDISite.htmlPage;
import static jdisite.pages.JDISite.selectInMenu;
import static org.hamcrest.Matchers.is;
import static org.testng.Assert.assertEquals;

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
        htmlPage.suspendButton.click();
        validateAlert(is("Suspend button"));
    }
}
