/**
 * HelloApp - UC7 - A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names.
 */
public class HelloApp {

    public static void main(String[] args) {
        String names = "World";

        // Check if command-line arguments are provided
        if (args.length > 0) {
            // Join all arguments with a comma and space
            names = String.join(", ", args);
        }

        // Display the personalized greeting
        System.out.println("Hello, " + names + "!");
    }
}