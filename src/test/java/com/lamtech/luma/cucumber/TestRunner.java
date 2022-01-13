package com.lamtech.luma.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"com.lamtech.luma.stepDefinition"},
        plugin = {"pretty","html:target/site/cucumber-report/cucumber.html"},
        tags = "@AccountManagement"
)
public class TestRunner {
}
