package project.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "html:testOutput/reports/cucumber_DB_Regression.html",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = ".//src//test//resources//features",
        glue = {"project.stepDefinitions"},
        tags = "@regression",
        dryRun = false,
        monochrome=true

)
public class RegressionRunner {
}
