package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter DEFAULT_DATE_FORMAT = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    private static final DateTimeFormatter SHORT_DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private DateUtils() {
        // Private constructor to prevent instantiation
    }

    public static String getCurrentFormattedDate() {
        return LocalDate.now().format(DEFAULT_DATE_FORMAT);
    }

    public static String getCurrentDateTime() {
        return LocalDateTime.now().format(DATE_TIME_FORMAT);
    }

    public static String getFutureDate(int daysToAdd) {
        return LocalDate.now().plusDays(daysToAdd).format(SHORT_DATE_FORMAT);
    }
}
