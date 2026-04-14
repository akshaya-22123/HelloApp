public class HelloApp {

    public static void main(String[] args) {
        // If no names are provided, display "Hello, World!"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // 1. Enhanced For Loop to iterate through arguments
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String finalNames = "";
            // 2. Remove trailing delimiter using substring if names exist
            if (nameBuilder.length() > 0) {
                // Removes the last ", " (2 characters)
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}