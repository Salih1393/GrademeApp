package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Driver;

public class Hooks {
    public static Scenario currentScenario;

    @Before
    public void beforeScenario(Scenario scenario) {
        currentScenario = scenario;
        Driver.getDriver(); // Ensures the WebDriver is initialized
    }

    @After
    public void afterScenario() {
        try {
            if (Driver.getDriver() != null)
                Driver.quitDriver(); // Ensures WebDriver is properly closed

        } catch (Exception e) {
            System.err.println("WARNING: Failed to quit WebDriver - " + e.getMessage());
        }
    }
}
