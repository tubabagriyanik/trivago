# Trivago Reservation Feature Testing

## Project Overview
This project contains automated test scripts for testing the reservation feature on the Trivago website. Developed as part of the responsibilities of a Software Development Engineer in Test (SDET), the tests aim to ensure that users have a seamless experience when searching for hotels, applying filters, and viewing reservation options across multiple sites integrated with Trivago.

## Features Tested
The test scripts cover the following features of the Trivago reservation workflow:

- **Search Functionality:** Tests the search field for location-based hotel searches and verifies the accuracy of search results.
- **Filter Options:** Validates the usability and accuracy of various filters, such as price range, property type, guest rating, and proximity to specific locations or addresses.
- **Location Proximity:** Ensures that users can search for hotels based on distance from the city center or a specific address.
- **Price Comparison:** Confirms that Trivago correctly aggregates and displays pricing options from different providers (e.g., Expedia, Vio.com) and indicates any discounts or special offers.
- **Booking Flow:** Tests the reservation selection flow to verify that users can view, select, and proceed with their booking from third-party providers without errors.

## Tech Stack
- **Automation Framework:** Selenium WebDriver with TestNG for organizing and executing test cases.
- **Programming Language:** JavaScript for test scripts, integrated with a JavaScript testing framework (e.g., Mocha or Jest).
- **CI/CD Integration:** Jenkins for continuous integration and automation of test execution.
- **Version Control:** GitHub for code repository and version management.

## Getting Started

### Prerequisites
- Node.js and npm installed for JavaScript dependencies.
- WebDriver (ChromeDriver/GeckoDriver) configured for Selenium.
- Access to a GitHub account and Jenkins for CI/CD pipeline setup.


