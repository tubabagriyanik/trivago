package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccount extends BasePage{

    @FindBy(xpath = "//span[text()='Log in']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    //@FindBy(xpath = "//input[@class='BaseInput_input__0WXAa']")
    //public WebElement userEmail;
    @FindBy(xpath = "//button[text()='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement userLogIn;


    @FindBy(xpath = "//span[text()='M']")
    public WebElement userAccountButton;
    @FindBy(xpath = "//span[@class='flex-grow text-m whitespace-nowrap text-blue-900 font-bold rounded-full h-8 w-8 flex items-center justify-center bg-blue-200 border border-blue-500']")
    public WebElement userAccountBox;

    @FindBy(xpath = "//div[@class='h-full']")
    public WebElement accountSetting;
    @FindBy(xpath = "//span[text()='Account settings']")
    public WebElement accountSettings;

    @FindBy(xpath = "//label[text()='Last name']")
    public WebElement lastNameButton;
    @FindBy(xpath = "//span[text()='Update personal information']")
    public WebElement updatePersonalInfo;

}
