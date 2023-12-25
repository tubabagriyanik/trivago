package project.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.US_02SearchPage;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import project.utilities.ReusableMethods;

public class Us_02_Search {
US_02SearchPage page = new US_02SearchPage();

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("User click destination")
    public void user_click_destination() {
        ReusableMethods.hover(page.whereTo);


    }
   // @Then("dropdown scrolled out")
   // public void dropdown_scrolled_out() {

   // }
   @When("user input city name to the empty field")
   public void user_input_city_name_to_the_empty_field() {

        page.Banf.sendKeys("Banf");

    }
    @Then("verified Banf Hotels appear on the window")
    public void verified_banf_hotels_appear_on_the_window() {

    }
    @And("click search button")
    public void click_search_button() {

    }
    @Then("user clicks check in field")
    public void user_clicks_check_in_field() {

    }
    @Then("user clicks check in calendar open and user select check in date")
    public void user_clicks_check_in_calendar_open_and_user_select_check_in_date() {

    }
    @Then("user clicks check out field")
    public void user_clicks_check_out_field() {

    }
    @Then("user clicks check out calendar open and user select check out date")
    public void user_clicks_check_out_calendar_open_and_user_select_check_out_date() {

    }
    @Then("user clicks to Search button")
    public void user_clicks_to_search_button() {

    }
    @Then("search button clickable and search result appear on website")
    public void search_button_clickable_and_search_result_appear_on_website() {

    }
    @Then("user verified search outcomes is visible")
    public void user_verified_search_outcomes_is_visible() {

    }



}
