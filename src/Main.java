import java.util.Scanner;

public class Main {

    // Declaring constants
    private static final double FREE_SHIPPING = 100.00;
    private static final double SHIPPING_RATE = 0.02;

    public static void main(String[] args) {

        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        double price = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";

        // Get user input
        System.out.print("Enter the price of the item: $");

        if (in.hasNextDouble()) {
            // Safe to read in a double
            price = in.nextDouble();
            in.nextLine(); // Clear the buffer

            // Calculate the shipping cost
            if (price >= FREE_SHIPPING) {
                shippingCost = 0;
            }
            else {
                shippingCost = price * SHIPPING_RATE;
            }

            // Calculate the total price
            totalPrice = price + shippingCost;

            // Output the results
            // Using printf to display the prices correct: https://www.w3schools.com/java/ref_output_printf.asp
            // Reference: https://stackoverflow.com/questions/65596761/how-to-always-keep-2-decimal-places-in-java
            System.out.printf("Item Price: $%.2f%n", price);
            System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
            System.out.printf("Total Price: $%.2f%n", totalPrice);
        }
        else {
            // Not a double, cannot use nextDouble()
            trash = in.nextLine(); // Read input as String
            System.out.print("\nYou entered: " + trash);
            System.out.print("\nRun the program again and enter a valid input!");
        }
    }
}