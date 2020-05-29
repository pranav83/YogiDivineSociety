package com.YDS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderLogoStepDefs extends BaseMain {

    HeaderandLogo hal = new HeaderandLogo();

    @Given("^I am on Yogi Divine Society homepage$")
    public void i_am_on_Yogi_Divine_Society_homepage() throws Throwable {
       hal.navigateTo();
    }

    @Given("^I should verify logo and text$")
    public void i_should_verify_logo_and_text() throws Throwable {
      hal.verifyLogo();
      hal.verifyText();
    }

    @When("^I click on links on header menu$")
    public void i_click_on_links_on_header_menu() throws Throwable {
        hal.aboutsLink();
        hal.textAboutUs();
        hal.linkCenter();
        hal.textCenters();
        hal.LinkEvents();
        hal.text_Events();
        hal.linkMediaGallery();
        hal.text_SundaySabha();
    }

    @Then("^I should navigate to relevant page$")
    public void i_should_navigate_to_relevant_page() throws Throwable {
        hal.linkActivities();
        hal.text_Activites();
        hal.linkUpsana();
        hal.text_Upasna();
    }

    @Then("^I click on make donation link$")
    public void i_click_on_make_donation_link() throws Throwable {
      hal.btnDonation();
    }

    @Then("^I should navigate to donation page$")
    public void i_should_navigate_to_donation_page() throws Throwable {
       hal.text_Donation();
    }
}
