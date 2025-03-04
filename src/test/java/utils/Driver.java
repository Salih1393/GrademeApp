package utils;

import constants.SeleniumConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static final String SAUCE_USERNAME = ConfigReader.readProperty("sauceUser");
    private static final String SAUCE_KEY = ConfigReader.readProperty("sauceKey");
    private static final String SAUCE_URL = "https://" + SAUCE_USERNAME + ":" + SAUCE_KEY + "@ondemand.saucelabs.com:443/wd/hub";

    private Driver() {
        // Private constructor to prevent instantiation
    }

    public static synchronized void initialize(String browser) {
        if (driver != null) return;

        if ("true".equalsIgnoreCase(ConfigReader.readProperty("runInSauceLabs"))) {
            driver = getRemoteDriver();
        } else {
            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser type: " + browser);
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(SeleniumConstants.IMPLICIT_WAIT_TIME));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(SeleniumConstants.PAGE_LOAD_TIME));
        driver.manage().window().maximize();
    }

    public static synchronized WebDriver getDriver() {
        if (driver == null) {
            initialize(ConfigReader.readProperty("browser"));
        }
        return driver;
    }

    public static synchronized void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static synchronized void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static WebDriver getRemoteDriver() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.setCapability("browserName", "chrome");
            options.setCapability("version", ConfigReader.readProperty("browser_version"));
            options.setCapability("platformName", ConfigReader.readProperty("os"));
            return new RemoteWebDriver(new URL(SAUCE_URL), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid remote WebDriver URL: " + SAUCE_URL, e);
        }
    }
}
