package project.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.BookingPage;
import project.utilities.ReusableMethods;

public class US_07_Booking {

    BookingPage bookingPage = new BookingPage();

<<<<<<< HEAD

    @Then("User enters a destination on home page")
    public void user_enters_a_destination_on_home_page() {

    }
=======
>>>>>>> main
    @When("User enters a destination")
    public void user_enters_a_destination() {
        bookingPage.EnterDestination.click();
        bookingPage.EnterDestination.sendKeys("New York");


    }
    @When("User enters check in date")
    public void user_enters_check_in_date() {

        bookingPage.clickCheckInButton.click();
        bookingPage.clickCheckInTonightButton.click();
        ReusableMethods.waitFor(3);


    }
    @When("User enter check out date")
    public void user_enter_check_out_date() {
        bookingPage.clickCheckOutButton.click();
        bookingPage.clickCheckOutTomorrowNightButton.click();
        ReusableMethods.waitFor(3);

    }
    @When("User clicks on search button")
    public void user_clicks_on_search_button() {

        bookingPage.searchButton.click();
        ReusableMethods.waitFor(2);
        bookingPage.closeCalender.click();
        ReusableMethods.waitFor(6);


    }
    @When("User clicks on first view deal button")
    public void user_clicks_on_first_view_deal_button() {

    }
    @When("User verifies url takes user to selected hotel web site")
    public void user_verifies_url_takes_user_to_selected_hotel_web_site() {

    }
    @When("User verifies the booking page in another tab")
    public void user_verifies_the_booking_page_in_another_tab() {

    }
    @When("User enter booking information")
    public void user_enter_booking_information() {

    }
    @Then("User verifies booking confirmation page")
    public void user_verifies_booking_confirmation_page() {

    }

}
