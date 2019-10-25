package com.jdi;

import jdisite.pages.HomePage;
import jdisite.pages.JDISite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static com.epam.jdi.light.driver.WebDriverFactory.getDriver;
import static com.epam.jdi.light.elements.init.PageFactory.initSite;
import static java.lang.Runtime.getRuntime;
import static jdisite.pages.JDISite.homePage;
import static jdisite.utils.DriverUtils.DRIVER;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initSite(JDISite.class);
        DRIVER = getDriver();
        homePage.open();
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() throws IOException {
        getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
