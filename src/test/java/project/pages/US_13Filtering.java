package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.Driver;

public class US_13Filtering extends BasePage {

    @FindBy(xpath = "//*[@id='input-auto-complete']")
    public WebElement destinationPoint;

    @FindBy(xpath = "//*[text()='New York']")
    public WebElement selectNewYork;

    @FindBy(xpath = "//button[@class='SearchButtonWithLoader_button___1Bps']")
    public WebElement searchButton;



    @FindBy(xpath = "(//*[@class='flex justify-center items-center text-m h-9 w-9'])[20]")
    public WebElement dateStarting;



    @FindBy(xpath = "(//*[@class='flex justify-center items-center text-m h-9 w-9'])[50]")
    public WebElement dateEnding;

    @FindBy(xpath = "//*[@ data-testid='nextWeekend-index-label']")
    public WebElement nextWeekend;


    @FindBy(xpath = "//*[@data-testid='guest-selector-apply']")
    public WebElement applyButton;

    @FindBy(xpath = "//*[@data-testid='loading-animation-advertisers-counter']")
    public WebElement SearchSortText;

    @FindBy(xpath = "//*[@data-testid='loading-animation-accommodations-counter']")
    public WebElement staysFoundText;










   //Price: price per night filter (slider)
    @FindBy(xpath = "//span[@class='truncate w-full']")
    public WebElement priceSlide;

    @FindBy(xpath = "//*[@data-testid='slider-handle-min']")
    public WebElement sliderMin;
    @FindBy(xpath = "//*[@data-testid='slider-handle-max']")
    public WebElement sliderMax;

    @FindBy(xpath = "//button[@data-testid='calendar-button-next']")
    public WebElement next2Months;

    @FindBy(xpath = "//*[@data-testid='filters-popover-apply-button']")
    public WebElement sliderApplyButton;



    // Filters

    @FindBy(xpath = "//span[@data-testid='4-star-hotels-filter']")
    public WebElement hotelStar;


    @FindBy(xpath = "//*[text()='Filters']")
    public WebElement applyFilters;



//    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[1]")
////    public WebElement checkBoxFreeCancelation;

    @FindBy(id = "//*[@data-testid='checkbox-1393']")
    public WebElement checkBoxFreeCancelation;

    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[2]")
    public WebElement breakfastIncluded;

    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[4]")
    public WebElement pool;
    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[5]")
    public WebElement wifi;
    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[6]")
    public WebElement parking;

    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[7]")
    public WebElement airConditioning;

    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[9]")
    public WebElement restaurant;

    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[10]")
    public WebElement petFriendly;

    @FindBy(xpath = "(//*[@data-testid='checkbox-input'])[15]")
    public WebElement familyFriendly;

    @FindBy(xpath = "//*[@data-testid='filters-popover-apply-button']")
    public WebElement filterApplyButton;

    //*[@data-testid='differentiated-reflected-concepts']


    @FindBy(xpath = "//*[@data-testid='differentiated-reflected-concepts']")
    public WebElement filtersInHotels;






















//    @FindBy(xpath = "//button[@data-testid='uc-accept-all-button']")
//    public WebElement acceptAllButton;








}
