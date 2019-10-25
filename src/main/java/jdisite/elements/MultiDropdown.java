package jdisite.elements;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MultiDropdown {
    @UI("#weather .caret") WebElement weatherExpand;
    @UI("#weather label") List<WebElement> weatherList;
    @UI("#weather button") WebElement weatherValue;
    @UI("#weather ul") WebElement weatherIsExpanded;
    private boolean weatherIsExpanded() {
        return weatherIsExpanded.getAttribute("style").equals("display: block;");
    }
    public void select(String value) {
        if (!weatherIsExpanded())
            weatherExpand.click();
        String[] values = value.split(", ");
        for (String val : values) {
            for (WebElement listOption : weatherList) {
                if (listOption.getText().trim().equals(val))
                    listOption.click();
            }
        }
    }
    public String getValue() {
        return weatherValue.getText();
    }
}
