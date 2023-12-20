package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;
    @FindBy(xpath = "//strong[text()='Property type']")
    public WebElement propertyType;
    @FindBy(xpath = "//label[@for='radio-91']")
        public WebElement houseApartmentCheckbox;
    @FindBy(xpath = "//span[@itemprop='name'][1]")
        public WebElement firstHouse;




}