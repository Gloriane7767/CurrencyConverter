import java.util.Scanner;

/**
 * CurrencyConverter
 */

public class currencyConverter {
    public static void main (String[] args) {

        //Currencies Intake
        System.out.println("1 SEK");
        System.out.println("2 USD");
        System.out.println("3 EURO");

        //Take input from Users
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the Currency");
        int choice = scanner.nextInt();

        System.out.println("Enter the Amount");
        double amount = scanner.nextDouble();
