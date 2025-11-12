import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.print("Enter target currency (EUR, GBP, JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(usdAmount, targetCurrency);
        if (convertedAmount != -1) {
            System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
        } else {
            System.out.println("Unsupported currency.");
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, String targetCurrency) {
        switch (targetCurrency) {
            case "EUR":
                return amount * 0.85; // Example conversion rate
            case "GBP":
                return amount * 0.75; // Example conversion rate
            case "JPY":
                return amount * 110.0; // Example conversion rate
            default:
                return -1; // Unsupported currency
        }
    }

    public static void testConvertCurrency() {
        assert convertCurrency(100, "EUR") == 85.0 : "Test Case 1 Failed";
        assert convertCurrency(100, "GBP") == 75.0 : "Test Case 2 Failed";
        assert convertCurrency(100, "JPY") == 11000.0 : "Test Case 3 Failed";
        assert convertCurrency(100, "AUD") == -1 : "Test Case 4 Failed";

        System.out.println("All test cases passed!");
    }

    

    public String toString() {
        return "currencyConverter{}";
    }
}