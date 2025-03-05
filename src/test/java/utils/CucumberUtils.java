package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import step_definitions.Hooks;

public class CucumberUtils {

    private CucumberUtils() {
        // Private constructor to prevent instantiation
    }

    public static void logInfo(String message, boolean takeScreenshot) {
        Scenario scenario = Hooks.currentScenario;

        if (scenario == null)
            throw new IllegalStateException("Scenario is null. Ensure Hooks.currentScenario is properly initialized.");

        scenario.log(DateUtils.getCurrentDateTime() + " INFO: " + message);

        if (takeScreenshot) {
            try {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            } catch (Exception e) {
                scenario.log("WARNING: Failed to take screenshot - " + e.getMessage());
            }
        }
    }
}
