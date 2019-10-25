package jdisite.pages;

import jdisite.enums.MenuOptions;
import jdisite.sections.LoginForm;
import org.openqa.selenium.By;

import static jdisite.utils.DriverUtils.DRIVER;

public class JDISite {
    public static HomePage homePage;
    public static ContactPage contactPage;
    public static Html5Page htmlPage;

    public static LoginForm loginForm;
    public static void selectInMenu(MenuOptions value) {
        DRIVER.findElement(By.xpath("//*[contains(@class, 'sidebar-menu')]//span[.='"+value.value+"']"))
                .click();
    }
}
