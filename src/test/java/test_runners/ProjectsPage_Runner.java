package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/ProjectsPage-report",
                "json:target/cucumber-reports/cucumberTestReports.json"
        },
        dryRun = false,
        tags = "@editorTest"
)
public class ProjectsPage_Runner {
}
