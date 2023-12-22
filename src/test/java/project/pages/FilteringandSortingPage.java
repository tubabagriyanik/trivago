package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilteringandSortingPage extends BasePage {


@FindBy(xpath = "//*[@id='input-auto-complete']")
    public WebElement destination;
@FindBy(xpath ="//*[@class='SearchButtonWithLoader_button___1Bps']")
    public WebElement searchbutton;

}
