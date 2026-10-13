/**
 * Exercise 7 — TemperatureConverter
 *
 * Convert both directions, to one decimal place.
 *
 *   C = (F - 32) * 5 / 9
 *   F = C * 9 / 5 + 32
 *
 * ⚠️ Careful: 5 / 9 in integer arithmetic is 0.
 *    Everything after that will be zero. Fix it.
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;

        double convertedCelsius = Math.round((fahrenheit - 32) * 5.0 / 9 * 10) / 10.0;
        double convertedFahrenheit = Math.round((celsius * 9.0 / 5 + 32) * 10) / 10.0;

        System.out.printf("%.1f°F = %.1f°C%n", fahrenheit, convertedCelsius);
        System.out.printf("%.1f°C = %.1f°F%n", celsius, convertedFahrenheit);
    }
}
