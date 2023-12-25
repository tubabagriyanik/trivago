package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends BasePage {

    @FindBy (xpath = "//input[@placeholder='Where to?']")
    public WebElement EnterDestination;

    @FindBy (xpath = "//input[@data-testid='search-form-destination']")
    public WebElement enterDestination2;





    @FindBy(xpath =" //button[@data-testid='search-button-with-loader']")
    public WebElement searchButton;


    @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
    public WebElement clickCheckInButton;

    @FindBy(xpath = "//label[@data-testid='tonight-index-label']")
    public WebElement clickCheckInTonightButton;

    @FindBy (xpath = "//button[@data-testid='search-form-calendar-checkout']")
    public WebElement clickCheckOutButton;

    @FindBy(xpath = "//label[@data-testid='tomorrowNight-index-label']")
    public WebElement clickCheckOutTomorrowNightButton;

    @FindBy (xpath= "(//span[@class='leading-none inline-flex transform'])[1]")
    public WebElement closeCalender;

    @FindBy(xpath = "(//div[@class='flex flex-col justify-between p-2 DealAreaWrapper_clickoutSectionWide__ZjK38 DealAreaWrapper_clickoutSectionFull__5TqlB w-1/2 w-2/5 pl-3'])[1])")
    public WebElement clickViewDealButton;

    @FindBy(xpath = "(//div[@data-testid='quickBookMainText'])[1]")
    public WebElement quickBookButton;

//    @FindBy(xpath = "//strong[@data-testid='recommended-price-partner']")
//    public WebElement hotelHilton;

    //vio hotel

    @FindBy(xpath = "(//span[@data-translations-id='viewDeal'])[1]")
    public WebElement vioViewDeal;

    @FindBy(xpath = "//span[@data-translations-id='book'][1]")
    public WebElement vioBook;

    @FindBy(xpath = "(//input[@autocomplete='cc-number'])[1]")
    public WebElement vioCcardNumBox;

    @FindBy(xpath ="//input[@id='payment.cc-exp']")
    public WebElement vioNextBox;

    @FindBy(xpath = "//span[@data-translations-id='emptyCreditCard']")
    public WebElement vioErrorMsg;

    @FindBy(xpath = "//p[@class='ec-5pfx34 e1og4rpj0'][4]")
    public WebElement vioErrmsg;
}
