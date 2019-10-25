package com.jdi;

import jdisite.pages.HomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static java.lang.Runtime.getRuntime;
import static jdisite.utils.DriverUtils.DRIVER;
import static jdisite.utils.DriverUtils.runChromeDriver;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        runChromeDriver();
        DRIVER.navigate().to(HomePage.URL);
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() throws IOException {
        getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
