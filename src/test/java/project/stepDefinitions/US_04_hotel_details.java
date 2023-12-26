package project.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.HomePage;
import project.pages.SearchPage;

public class US_04_hotel_details {
    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();
    @Then("user selects the Hotel checkbox")
    public void user_selects_the_hotel_checkbox() {
    searchPage.Hotel.click();

    }


    @Then("user verify the hotel price is visible")
    public void user_verify_the_hotel_price_is_visible() {

    }

    @When("user clicks the hotel name")
    public void user_clicks_the_hotel_name() {


    }
}
