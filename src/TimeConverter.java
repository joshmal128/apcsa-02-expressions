/**
 * Exercise 2 — TimeConverter
 *
 * Convert a number of seconds into hours, minutes, and seconds.
 *
 * Example: 9296 seconds  →  2 hours, 34 minutes, 56 seconds
 *
 * Hint: 1 hour = 3600 seconds, 1 minute = 60 seconds.
 * Same / and % pattern as ChangeMaker.
 */
public class TimeConverter {
    public static void main(String[] args) {
        int totalSeconds = 9296;

        int hours = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;

        int minutes = totalSeconds / 60;
        totalSeconds = totalSeconds % 60;

        int seconds = totalSeconds / 1;
        totalSeconds = totalSeconds % 1;

        System.out.println("Hours:   " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}

