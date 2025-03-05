package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readProperty(String property) {
        Properties prop = new Properties();

        try (FileInputStream fileInput = new FileInputStream(Driver.propertyPath)) {
            prop.load(fileInput);
        } catch (IOException e) {
            System.err.println("Error reading the property file: " + e.getMessage());
            return null;
        }

        String propertyValue = prop.getProperty(property);
        if (propertyValue == null) {
            System.err.println("Property '" + property + "' not found in the configuration file.");
        }
        return propertyValue;
    }
}
