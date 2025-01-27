package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(	features= {".//Features/BasicLinksTest/"},
        glue = {"steps", "hooks"},
        plugin = {"pretty", "html:src/test/resources/cucumber-reports", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true
        ,publish = true
)
public class TestRunner {
}
