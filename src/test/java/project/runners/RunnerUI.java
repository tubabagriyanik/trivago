package project.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",

        glue = "project.stepDefinitions",
        tags = "@US02" ,
        dryRun = false
)
public class RunnerUI {
}
