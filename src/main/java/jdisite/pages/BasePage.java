package jdisite.pages;

import static jdisite.utils.DriverUtils.DRIVER;
import static org.testng.Assert.assertEquals;

public abstract class BasePage {
    private String url;
    private String title;
    public BasePage() { }
    public BasePage(String url) {
        this.url = url;
    }
    public BasePage(String url, String title) {
        this.url = url;
        this.title = title;
    }
    public void open() {
        DRIVER.navigate().to(url);
    }
    public void checkOpened() {
        if (url != null)
            assertEquals(url, DRIVER.getCurrentUrl());
        if (title != null)
            assertEquals(title, DRIVER.getTitle());
    }
}
