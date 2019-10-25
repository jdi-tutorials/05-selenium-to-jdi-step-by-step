package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.*;

@Url("/")
public class HomePage extends WebPage {
    @UI("#user-icon") public static Icon userIcon;
    @UI("#user-name") public static Text userName;
    @UI(".fa-sign-out") public static Button logout;
}
