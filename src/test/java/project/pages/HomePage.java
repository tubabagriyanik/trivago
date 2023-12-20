package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginLink;
     @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement registerLink;

    @FindBy(xpath = "(//button[normalize-space()='Menu'])[1]")
    public WebElement menuLink;

    @FindBy(linkText = "Lesson Management")
    public WebElement lessonManagementButton;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramButton;
    //********************************** us04  **************************
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement us04LoginButton;
    @FindBy(xpath = "//div[@class='card-body']//form//div//input[1]")
    public WebElement us04username;
    @FindBy(xpath = "//div[@class='card-body']//form//div[2]//input")
    public WebElement us04password;
    @FindBy(xpath = "//div[@class='d-grid gap-2 col-6 mx-auto pt-4']//button")
    public WebElement us04submit;
    //********************************** us06  **************************

    @FindBy(xpath = "//input[@id='username']")
    public WebElement us06username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement us06pwd;
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement us06loginButton;

    //********************************** us07  **************************
    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement us07menuButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement us07contactGetAllButton;

    @FindBy(xpath = "//th[.='Message']")
    public WebElement us07messageColumn;

    @FindBy(xpath = "//th[.='Subject']")
    public WebElement us07subjectColumn;

    @FindBy(xpath = "//th[.='Date']")
    public WebElement us07dateColumn;

    @FindBy(xpath = "//th[.='Email']")
    public WebElement us07emailColumn;

    @FindBy(xpath = "//th[.='Name']")
    public WebElement us07nameColumn;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement us07editButton;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement us07leftAndRightTableBar;

    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement us07deleteButton;

    @FindBy(xpath = "//th[.='Name']")
    public WebElement us07nameTableColumn;

    @FindBy(xpath = "//th[.='Gender']")
    public WebElement us07genderTableColumn;

    @FindBy(xpath = "//th[.='Phone Number']")
    public WebElement us07phoneNumberTableColumn;

    @FindBy(xpath = "//th[.='Ssn']")
    public WebElement us07ssnTableColumn;

    @FindBy(xpath = "//th[.='User Name']")
    public WebElement us07userNameTableColumn;
    //********************************** us010  **************************

    @FindBy(xpath = "//a[@class='header_link ms-2']/i")
    public WebElement us10loginLink;

    @FindBy(xpath = "(//button[normalize-space()='Menu'])[1]")
    public WebElement us10menuLink;
    //********************************** us018  **************************
    @FindBy(xpath = "//a[@class='header_link ms-2']/i")
    public WebElement us018loginPageButton;
    //********************************** us019  **************************

    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement teacherCredential;

    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement us019studentInfoManagement;
    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement us019teacherMenuButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement us019meetManagementButton;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement us019selectStudentsBar;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement us019dateOfMeet;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement us019startTime;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement us019stopTime;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement us019description;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement us019submitMeeting;

    @FindBy(xpath = "(//div[.='mario balotelli'])[4]")
    public WebElement us019createdStudent;

    @FindBy(id = "react-select-2-input")
    public WebElement us019selectingBar;

    @FindBy(xpath = "//div[@class=' css-19bb58m']//input")
    public WebElement us019selectingBarClickable;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement us019dateOfMeetAssertion;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement us019startTimeAssertion;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement us019endingTimeAssertion;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement us019descriptionAssertion;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement us019meetingAlert;  //id=47

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement us019dateTimeMustBeFutureAlert;  //id=42

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement us019studentSelectedAlert;
    //********************************** us22  **************************
    @FindBy(xpath = "//div[@class='header-top']/div/div/div[2]/a[2]")
    public WebElement us22loginPageButton;

}
