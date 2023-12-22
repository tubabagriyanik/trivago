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
    @FindBy(id = "tabs-296-tab-0")
    public WebElement overview;
    @FindBy(xpath = "//button[@id='tabs-293-tab-1']")
    public WebElement info;
    @FindBy(id = "tabs-343-tab-2")
    public WebElement photos;
    @FindBy(id = "tabs-343-tab-3")
    public WebElement reviews;
    @FindBy(id = "tabs-343-tab-4")
    public WebElement price;
    @FindBy(xpath= "//article[@data-testid='amenities-module']")
    public WebElement topAmenities;



}
