package com.sparta.as.stepdefs;

import com.sparta.as.Raindrops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {

    private Raindrops raindrops;
    private String actualOutput;

    @Given("I create an instance of Raindrops")
    public void iCreateAnInstanceOfRaindrops() {
        raindrops = new Raindrops();
    }

    @When("I use the plingPlangPlong method with the input {int}")
    public void iUseThePlingPlangPlongMethodWithTheInput(int number) {
        actualOutput = raindrops.plingPlangPlong(number);
    }

    @Then("I return {string}")
    public void iReturn(String expectedOutput) {
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
