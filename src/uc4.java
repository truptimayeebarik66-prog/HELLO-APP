public class HelloApp {

    public static void main(String[] args) {
        String name;

        // Check if command-line arguments are provided
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Iterate through the arguments to build the string
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space between names, but not after the last one
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        } else {
            // Default value if no names are provided
            name = "World";
        }

        // Print the final greeting
        System.out.println("Hello, " + name + "!");
    }
}