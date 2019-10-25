package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Url("/")
public class HomePage extends WebPage {
    @FindBy(id ="user-icon") public static WebElement userIcon;
    @FindBy(id ="user-name") public static WebElement userName;
    @FindBy(css = ".fa-sign-out") public static WebElement logout;
}
