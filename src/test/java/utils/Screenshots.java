package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Screenshots {
    private static final WebDriver driver = Driver.getDriver();  // Constant for WebDriver

    public static void captureScreenShot() {
        String date = DateUtils.getCurrentDateTime();
        String screenshotPath = Paths.get("src", "main", "resources", "screenshots", "screenshot_" + sanitizeFileName(date) + ".jpeg").toString();

        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(screenshotPath));
            System.out.println("Screenshot saved at: " + screenshotPath);
        } catch (IOException e) {
            System.err.println("Error while capturing screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Helper method to sanitize the filename (remove unwanted characters)
    private static String sanitizeFileName(String fileName) {
        return fileName.replaceAll("[^a-zA-Z0-9]", "_");  // Replaces non-alphanumeric characters with '_'
    }
}
