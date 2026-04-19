/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For
 * Loop or Default Message - The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user using
 * an enhanced for loop. If no names are provided, it should display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * @author Developer Name
 * @version 5.0
 */
public class HelloApp {

    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Use enhanced for loop to traverse all arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Build and print the final greeting message
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}