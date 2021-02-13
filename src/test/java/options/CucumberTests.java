package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, dryRun = false,
		features = "src/test/features",
		glue = "stepdefs"
		)
public class CucumberTests {    }
