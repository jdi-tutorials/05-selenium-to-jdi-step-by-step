package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

@Url("/")
public class HomePage extends WebPage {
    @UI("#user-icon") public static WebElement userIcon;
    @UI("#user-name") public static WebElement userName;
    @UI(".fa-sign-out") public static WebElement logout;
}
