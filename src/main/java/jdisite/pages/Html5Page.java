package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Url("/html5.html") @Title("HTML 5")
public class Html5Page extends WebPage {
    @FindBy(id = "suspend-button")
    public static WebElement suspendButton;

}
