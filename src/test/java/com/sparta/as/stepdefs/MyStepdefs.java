package com.sparta.as.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I create an instance of Raindrops")
    public void iCreateAnInstanceOfRaindrops() {
    }

    @When("I use the plingPlangPlong method")
    public void iUseThePlingPlangPlongMethod() {
    }

    @And("I enter {int} as the input")
    public void iEnterAsTheInput(int number) {
    }

    @Then("I return {string}")
    public void iReturn(String output) {
    }
}
