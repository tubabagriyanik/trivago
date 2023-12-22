package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US01_Page extends BasePage{

    @FindBy(xpath = "//h2[text()='Popular searches']")
    public static WebElement page_center; //sayfa ortasindaki 'Popular searches' text TB

    @FindBy(xpath = "//h2[text()='Popular searches']")
    public static WebElement page_end; //sayfa sonundaki 'Help' text TB
}
