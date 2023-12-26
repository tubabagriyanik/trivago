package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class US_02SearchPage extends BasePage {


@FindBy(id = "id=\"input-auto-complete\"")
        public WebElement whereTo;

@FindBy(xpath = "//*[@id=\"suggestion-list\"]/ul/li[5]/div/div/div[2]/span[2]")
    public WebElement Banf;

    }

