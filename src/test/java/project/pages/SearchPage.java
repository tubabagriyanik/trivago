package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@autocorrect='off']")
    public WebElement destination;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
        public WebElement checkInClick;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkout']")
    public WebElement checkOutClick;
    @FindBy(xpath = "//span[@class='inline-flex leading-none -rotate-90 transform transform']")
    public WebElement propertyType;
    @FindBy(xpath = "//span[text()='Montréal']")
        public WebElement montreal;

}
