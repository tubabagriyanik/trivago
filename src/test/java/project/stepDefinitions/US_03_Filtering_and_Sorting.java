package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import project.pages.FilteringandSortingPage;
import project.utilities.ConfigReader;
import project.utilities.Driver;

public class US_03_Filtering_and_Sorting {

    FilteringandSortingPage filterandSortingPage = new FilteringandSortingPage();

//    @Given("User navigates to {string}")
//    public void userNavigatesTo(String url) {Driver.getDriver().get(ConfigReader.getProperty(url));
//    }


    @Then("User clicks on Destination home page")
    public void userClicksOnDestinationHomePage() {
      filterandSortingPage.destination.sendKeys("USA");


    }

    @When("User enters a USA")
    public void userEntersAUSA() {
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        filterandSortingPage.destination.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB);
        filterandSortingPage.searchbutton.click();
    }

    @And("User clicks on price")
    public void userClicksOnPrice() {
    }

    @And("User choose scroll button and change the price")
    public void userChooseScrollButtonAndChangeThePrice() {
    }

    @And("User clicks Apply button")
    public void userClicksApplyButton() {
    }

    @And("User clicks on Filters")
    public void userClicksOnFilters() {
    }

    @And("User clicks {int}star")
    public void userClicksStar(int arg0) {
    }

    @And("User clicks Popular filters and choose Family friendly box,Pet-friendly box")
    public void userClicksPopularFiltersAndChooseFamilyFriendlyBoxPetFriendlyBox() {
    }

    @And("User see that the Stays found: {int}+ area has changed")
    public void userSeeThatTheStaysFoundAreaHasChanged(int arg0) {
    }

    @And("User clicks on Guest Rating")
    public void userClicksOnGuestRating() {
    }

    @And("User choose {double}+ Excellent")
    public void userChooseExcellent(int arg0, int arg1) {
    }

    @And("User clicks on Property Type")
    public void userClicksOnPropertyType() {
    }

    @And("User choose Hotel box")
    public void userChooseHotelBox() {
    }

    @And("User review the result according to the selected sorting criteria and confirm accuracy")
    public void userReviewTheResultAccordingToTheSelectedSortingCriteriaAndConfirmAccuracy() {
    }


    @And("User waits {int} seconds")
    public void userWaitsSeconds(int sayi) {
        try {
            Thread.sleep(sayi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
