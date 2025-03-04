package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumUtils {

    private static final WebDriver driver = Driver.getDriver();
    private static final Duration IMPLICIT_WAIT_TIME = Duration.ofSeconds(10);
    private static final Duration EXPLICIT_WAIT_TIME = Duration.ofSeconds(20);

    public static void sleep(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void waitForClickability(WebElement element) {
        WebDriverWait explicitWait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        explicitWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForVisibilityOfAll(List<WebElement> elements) {
        WebDriverWait explicitWait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        explicitWait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public static void waitForVisibilityOfElement(WebElement element) {
        WebDriverWait explicitWait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME);
        wait.until((ExpectedCondition<Boolean>) drv ->
                ((JavascriptExecutor) drv).executeScript("return document.readyState").equals("complete"));
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        highlightElement(element);
        element.click();
    }

    public static void clear(WebElement element) {
        waitForClickability(element);
        highlightElement(element);
        element.clear();
    }

    public static void sendKeys(WebElement element, String input) {
        waitForVisibilityOfElement(element);
        highlightElement(element);
        element.sendKeys(input);
    }

    public static String getText(WebElement element) {
        waitForVisibilityOfElement(element);
        highlightElement(element);
        return element.getText();
    }

    public static void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("arguments[0].setAttribute('style', 'color: black; border: 3px solid red; background: yellow');", element);
            sleep(500);
            js.executeScript("arguments[0].setAttribute('style', '');", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
