/**
 * Exercise 1 — ChangeMaker
 *
 * Given a total in CENTS, output the fewest coins that make it up.
 *
 * Example: 287 cents
 *   Quarters: 11
 *   Dimes:    1
 *   Nickels:  0
 *   Pennies:  2
 *
 * Use only / and %. No conditionals — you don't have them yet.
 *
 * Strategy for each coin:
 *   count     = remaining / coinValue
 *   remaining = remaining % coinValue
 */
public class ChangeMaker {
    public static void main(String[] args) {
        int totalCents = 287;   // try other values when it works

        int quarters = totalCents / 25;
        totalCents = totalCents % 25;

        int dimes = totalCents / 10;
        totalCents = totalCents % 10;

        int nickels = totalCents / 5;
        totalCents = totalCents % 5;

        int pennies = totalCents / 1;
        totalCents = totalCents % 1;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes:    " + dimes);
        System.out.println("Nickels:  " + nickels);
        System.out.println("Pennies:  " + pennies);
    }
}


    