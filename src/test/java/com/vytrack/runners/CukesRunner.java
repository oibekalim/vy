package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( plugin = {
        "json:target/cucumber.json",
        "html:target/default-cucumber-report"},

        features = "src/test/resources/com/vytrack/features",
        glue = "com/vytrack/step_definitions",
        dryRun = true,
        tags = "@login"

)

public class CukesRunner {
}
// /Users/oibek/Document/vytrack-automation-project/src/test/java/com/vytrack/step_definitions
    //    /Users/oibek/Document/vytrack-automation-project/src/test/resources/com/vytrack/features