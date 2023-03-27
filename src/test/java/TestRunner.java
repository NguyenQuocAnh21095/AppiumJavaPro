import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty","json:target/junit-cucumber-reports/cucumber.json",
                "junit:target/junit-cucumber-reports/cucumberReport.xml",
                "html:target/junit-cucumber-reports/cucumberReport.html"}
//        tags = "@playlists"
)

public class TestRunner {
}

