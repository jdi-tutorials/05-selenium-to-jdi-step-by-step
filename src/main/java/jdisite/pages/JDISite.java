package jdisite.pages;

import com.epam.jdi.light.elements.composite.Form;
import jdisite.entities.User;
import jdisite.enums.MenuOptions;
import org.openqa.selenium.By;

import static com.epam.jdi.light.driver.WebDriverFactory.getDriver;

public class JDISite {
    public static HomePage homePage;
    public static ContactPage contactPage;
    public static Html5Page htmlPage;

    public static Form<User> loginForm;
    public static void selectInMenu(MenuOptions value) {
        getDriver().findElement(By.xpath("//*[contains(@class, 'sidebar-menu')]//span[.='"+value.value+"']"))
                .click();
    }
}
