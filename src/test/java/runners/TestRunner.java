package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/ModalTest.feature", glue = {"steps", "hooks"}, plugin = {"pretty", "html:src/test/resources/cucumber-reports", "json:target/cucumber.json"})
public class TestRunner {
}
