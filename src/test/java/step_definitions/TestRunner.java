package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(  monochrome = true,
//        tags = { "~@wip", "@runThisTag"},

        features = "src/test/java/features",
//        format = { "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "step_definitions" )

public class TestRunner {
    //Run this
}

