public class HelloApp {

    public static void main(String[] args) {
        // If no names are provided, display "Hello, World!"
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder nameBuilder = new StringBuilder();
        
        // Use an Enhanced For Loop to iterate through names
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        String finalNames = "";
        // Remove the trailing delimiter (", ")
        if (nameBuilder.length() > 0) {
            finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Display personalized greeting
        System.out.println("Hello, " + finalNames + "!");
    }
}