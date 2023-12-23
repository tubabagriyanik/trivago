package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@autocorrect='off']")
    public WebElement destination;
    @FindBy(xpath = "//input[@data-testid='search-form-destination']")
    public WebElement destinationButton;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement checkInClick;
    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkout']")
    public WebElement checkOutClick;
    @FindBy(xpath = "//button[@name='property_type']")
    public WebElement propertyType;
    @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-entire house / apartment']")
    public WebElement entireHouseCheckbox;
    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement applyButton;
    @FindBy(xpath = "//button[@data-testid='item-name']")
    public WebElement firstHouseTitle;
    @FindBy(xpath = "//span[@data-testid='price-label']")
    public WebElement priceTravel;
    @FindBy(xpath = "//button[@role='tab']")
    public WebElement overview;

    @FindBy(xpath= "//article[@data-testid='amenities-module']")
    public WebElement topAmenities;



}
