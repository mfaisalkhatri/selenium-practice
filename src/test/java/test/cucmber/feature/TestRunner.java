package test.cucmber.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Wasiq B
 * @since 30-Jul-2016 5:51:14 pm
 */
@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/java/test/cucmber/feature", glue = "src/test/java/test/cucmber/feature/LoginSteps")
public class TestRunner {

}
