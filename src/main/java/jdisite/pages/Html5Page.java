package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

@Url("/html5.html") @Title("HTML 5")
public class Html5Page extends WebPage {
    @UI("#suspend-button")
    public static WebElement suspendButton;

}
