package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("the user navigates to Fleet, Vehicles ");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates Marketing, Campaigns")
    public void the_user_navigates_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns ");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("Expected and Actual title are matching");

    }

    @When("the user navigates Activities, Calendar Events")
    public void the_user_navigates_Activities_Calendar_Events() {
        System.out.println("the user navigates Activities, Calendar Events");
    }

    @Then("the title should be Calendars")
    public void the_title_should_be_Calendars() {
        System.out.println("Expected and Actual title are matching");

    }


}
