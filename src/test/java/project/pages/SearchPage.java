package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//label[@for='input-auto-complete']")
    public WebElement destination;
    @FindBy(xpath = "//*[.='Check in']")
        public WebElement checkInClick;
    @FindBy(xpath = "//span[text()='Montréal']")
        public WebElement montreal;

}
