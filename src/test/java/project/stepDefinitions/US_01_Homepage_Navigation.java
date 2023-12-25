package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.HomePage;
import project.pages.US01_Page;
import project.pages.SearchPage;
import project.utilities.Driver;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;
import project.utilities.WaitUtils;

public class US_01_Homepage_Navigation {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    @Given("User goes to {string} page")
    public void userGoesToPage(String url) {

        Driver.getDriver().get(url);
    }

    @When("User goes to the center of the page")
    public void userGoesToTheCenterOfThePage() {
        JSUtils.scrollIntoViewJS(US01_Page.page_center);
        ReusableMethods.verifyElementDisplayed(US01_Page.page_center);
        WaitUtils.waitFor(1);
    }

    @And("User goes to the below of the page")
    public void userGoesToTheBelowOfThePage() {
        ReusableMethods.scrollEnd();
//        ReusableMethods.verifyElementDisplayed(US01_Page.page_end);
        WaitUtils.waitFor(1);
    }

    @And("User goes to the above of the page")
    public void userGoesToTheAboveOfThePage() {

        ReusableMethods.scrollHome();
    }

    @And("User waits {int} seconds_tb")
    public void userWaitsSeconds_tb(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User clicks to {string} button_tb")
    public void userClicksToButton_tb(String arg0) {

    }

    @And("User input {string}")
    public void userInput(String arg0) {
    }

    @And("User selects to {string}")
    public void userSelectsTo(String arg0) {
    }

    @And("User clicks to Adult {string} button_tb")
    public void userClicksToAdultButton_tb(String arg0) {
    }

    @And("User clicks to Children {string} button_tb")
    public void userClicksToChildrenButton_tb(String arg0) {
    }

    @And("User clicks to Rooms {string} button_tb")
    public void userClicksToRoomsButton_tb(String arg0) {
    }

    @And("User choose {string} age")
    public void userChooseAge(String arg0) {
    }

    @And("User verify to search button")
    public void userVerifyToSearchButton() {
    }



}
