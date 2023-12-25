package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
<<<<<<< HEAD
=======

>>>>>>> ad1526ef58637c32a071d2292f88a959b62f38fc

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='search-button-with-loader']")
    public WebElement searchButton;
<<<<<<< HEAD
=======

    @FindBy(xpath = "//p[@data-testid='no-results-suggestion']")
    public WebElement noResultsAlert;
>>>>>>> ad1526ef58637c32a071d2292f88a959b62f38fc

    @FindBy(xpath = "//p[@data-testid='no-results-suggestion']")
    public WebElement noResultsAlert;

}