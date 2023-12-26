package aaaaaaaaaaaaaaaaaaaaaaaaaaaaa;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import project.pages.FilteringandSortingPage;
import project.pages.HomePage;
import project.pages.US_13Filtering;
import project.utilities.Driver;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;

public class US_13_Filtering {

    US_13Filtering us13Filtering = new US_13Filtering();


    @Then("User enters {string} on Destination box")
    public void user_enters_on_destination_box(String word) {
       us13Filtering.destinationPoint.sendKeys(word,Keys.ENTER);
    }

    @When("user  checks in and checks out.")
    public void user_checks_in_and_checks_out() {
        us13Filtering.destinationPoint.sendKeys(Keys.TAB);

        us13Filtering.nextWeekend.click();


    }
    @When("user enters Adults, Children and Rooms number and clicks apply button")
    public void user_enters_adults_children_and_rooms_number_and_clicks_apply_button() {
        us13Filtering.applyButton.click();
    }

    @When("User clicks the search button")
    public void user_clicks_the_search_button() {
        us13Filtering.searchButton.click();
    }
    @Then("validate filters and sort results")
    public void validate_filters_and_sort_results() {
        Assert.assertTrue(us13Filtering.SearchSortText.isDisplayed());
        Assert.assertTrue(us13Filtering.staysFoundText.isDisplayed());
    }



}