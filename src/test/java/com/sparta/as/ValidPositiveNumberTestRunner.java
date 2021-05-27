package com.sparta.as;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {"pretty", "html:target/plingplangplong_report.html"},
        tags = "@ValidPositiveNumberTests"
)
public class ValidPositiveNumberTestRunner {
}
