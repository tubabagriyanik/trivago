package project.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.HomePage;
import project.pages.SearchPage;


public class US_09_Error_Handling {

    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Given("User clicks on search query box")
    public void user_clicks_on_search_query_box() {

    }
    @When("User enters invalid data")
    public void user_enters_invalid_data() {

    }
    @Then("User should see the error message.")
    public void user_should_see_the_error_message() {

    }

// **************************************************************************





    @Given("User enters destination on the search box")
    public void user_enters_destination_on_the_search_box() {

    }
    @When("User clicks on Search button")
    public void user_clicks_on_search_button() {

    }
    @When("User clicks on View Deal button of the Hotel information box")
    public void user_clicks_on_view_deal_button_of_the_hotel_information_box() {

    }
    @When("Website switches to another tab")
    public void website_switches_to_another_tab() {

    }
    @When("User selects a room and clicks on Quick Book button")
    public void user_selects_a_room_and_clicks_on_quick_book_button() {

    }
    @When("User clicks Continue button on the pop-up message box")
    public void user_clicks_continue_button_on_the_pop_up_message_box() {

    }
    @When("User enters invalid card number")
    public void user_enters_invalid_card_number() {

    }
    @Then("User should see the error message under card number box")
    public void user_should_see_the_error_message_under_card_number_box() {

    }

}
