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
    @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-entire house / apartment']")
    public WebElement entireHouseCheckbox;
     @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement applyButton;

    @FindBy(xpath = "//span[text()='Montréal']")
        public WebElement montreal;

}
