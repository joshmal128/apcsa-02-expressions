public class DigitExtractor {
    public static void main(String[] args) {
        int number = 472;

        int ones = number % 10;
        number = number / 10;

        int tens = number % 10;
        number = number / 10;

        int hundreds = number % 10;

        int sum = hundreds + tens + ones;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens:     " + tens);
        System.out.println("Ones:     " + ones);
        System.out.println("Sum:      " + sum);
    }
}

