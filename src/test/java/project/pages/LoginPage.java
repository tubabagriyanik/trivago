package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement us02userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement us02passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement us02loginButton;
    //********************************** us06  **************************
    @FindBy(xpath = "//input[@id='username']")
    public WebElement us06username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement us06pwd;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement us06loginButton;
    //********************************** us07  **************************
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement us07homePageLoginButton;

    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement us07userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement us07password;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement us07loginButton;
    //********************************** us010  **************************
    @FindBy(xpath = "//input[@id='username']")
    public WebElement us10userNameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement us10passwordBox;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement us10loginButton;
    //********************************** us014  **************************
    @FindBy(id = "username") public WebElement us014usernameBox;
    @FindBy(id = "password") public WebElement us014passwordBox;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']") public WebElement us014loginButton;
    //********************************** us015  **************************
    @FindBy(id="username")
    public WebElement us015username;
    @FindBy(id="password")
    public WebElement us015password;
    @FindBy(xpath="//button[@class='fw-semibold btn btn-primary']")
    public WebElement us015loginButton;
    //********************************** us018  **************************
    @FindBy(xpath = "//input[@id='username']")
    public WebElement us018usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement us018passwordBox;

    @FindBy(xpath = "//button[@type='button'][text()='Login']")
    public WebElement us018loginButton;
    //********************************** us019  **************************
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement us019homePageLoginButton;

    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement us019userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement us019password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement us019loginButton;
    //********************************** us22  **************************
    @FindBy(xpath = "//a[@class='header_link ms-2']/i")
    public WebElement us22loginPageButton;

    //Username
    @FindBy(id = "username")
    public WebElement us22username;

    //    //Password
    @FindBy(id = "password")
    public WebElement us22password;
    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement us23menuButton;



}
