package project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import project.pages.BookingPage;
import project.utilities.ReusableMethods;

public class US_07_Booking {

    @Then("User enters a destination on home page")
    public void user_enters_a_destination_on_home_page() {

        BookingPage bookingPage = new BookingPage();


        @When("User enters a destination")
        public void user_enters_a_destination () {
            bookingPage.EnterDestination.click();
            bookingPage.EnterDestination.sendKeys("New York");


        }

        @And("User enters check in date")
        public void userEntersCheckInDate () {
            bookingPage.clickCheckInButton.click();
            bookingPage.clickCheckInTonightButton.click();
            ReusableMethods.waitFor(3);

        }

        @And("User enter check out date")
        public void userEnterCheckOutDate () {
            bookingPage.clickCheckOutButton.click();
            bookingPage.clickCheckOutTomorrowNightButton.click();
            ReusableMethods.waitFor(3);
        }
        @When("User clicks on search button")
        public void user_clicks_on_search_button () {
            bookingPage.searchButton.click();
            ReusableMethods.waitFor(2);
            bookingPage.closeCalender.click();
            ReusableMethods.waitFor(6);


        }

        @And("User clicks on first view deal button")
        public void userClicksOnFirstViewDealButton () {
            //  bookingPage.clickViewDealButton.click();
        }
        @When("User verifies url takes user to selected hotel web site")
        public void user_verifies_url_takes_user_to_selected_hotel_web_site () {

        }
        @When("User verifies the booking page in another tab")
        public void user_verifies_the_booking_page_in_another_tab () {

        }
        @When("User enter booking information")
        public void user_enter_booking_information () {

        }
        @Then("User verifies booking confirmation page")
        public void user_verifies_booking_confirmation_page () {

        }


    }
