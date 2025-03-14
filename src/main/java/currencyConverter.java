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

        //Convert the Amount
        switch (choice) {
            case 1:
                SEK_to_other(amount);
                break;
            case 2:
                USD_to_other(amount);
                break;
            case 3:
                EURO_to_other(amount);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void SEK_to_other(double amount) {
        System.out.println("1 SEK =" + 0.98 + " USD");
        System.out.println();
        System.out.println(amount + " SEK = " + (amount*0.98) + "USD");
        System.out.println();

        System.out.println("1 SEK =" + 0.090 + " EURO");
        System.out.println();
        System.out.println(amount + "1 SEK = " + (amount*0.090) + "EURO");
        System.out.println();
    }

    public static void USD_to_other(double amount) {
        System.out.println("1 USD =" + 10.17 + " SEK");
        System.out.println();
        System.out.println(amount + " USD = " + (amount*10.17) + "SEK");
        System.out.println();

        System.out.println("1 USD =" + 0.92 + " EURO");
        System.out.println();
        System.out.println(amount + "USD = " + (amount*0.92) + "EURO");
        System.out.println();
    }
    //Euro to others
    public static void EURO_to_other(double amount) {
        System.out.println("1 EURO =" + 11.03 + " SEK");
        System.out.println();
        System.out.println(amount + " EURO = " + (amount*11.03) + "SEK");
        System.out.println();

        System.out.println("1 EURO =" + 1.085 + " USD");
        System.out.println();
        System.out.println(amount + " EURO = " + (amount*1.085) + "USD");
        System.out.println();
    }
}


