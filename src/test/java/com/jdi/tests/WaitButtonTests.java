package com.jdi.tests;

import com.jdi.TestsInit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.driver.WebDriverFactory.getDriver;
import static com.jdi.states.State.loggedIn;
import static java.time.Duration.ofSeconds;
import static jdisite.enums.MenuOptions.ElementsPacks;
import static jdisite.enums.MenuOptions.HTML5;
import static jdisite.pages.JDISite.htmlPage;
import static jdisite.pages.JDISite.selectInMenu;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
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
        //Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(getDriver(), ofSeconds(4));
        wait.until(visibilityOf(htmlPage.suspendButton));

        htmlPage.suspendButton.click();
        assertEquals(getDriver().switchTo().alert().getText(), "Suspend button");
    }
}
