package jdisite.pages;

import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import jdisite.entities.User;

public class JDISite {
    public static HomePage homePage;
    public static ContactPage contactPage;
    public static Html5Page htmlPage;

    public static Form<User> loginForm;
    @UI("//*[contains(@class, 'sidebar-menu')]//span[.='%s']")
    public static Menu leftMenu;
}
