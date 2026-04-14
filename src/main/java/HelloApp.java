public class HelloApp {
    public static void main(String[] args) {
        String names;

        // 1. Default Values: Providing a fallback value when no input is given
        if (args.length == 0) {
            names = "World";
        } else {
            // 6. StringBuilder: Efficiently building a string from multiple parts
            StringBuilder nameBuilder = new StringBuilder();

            // 7. Looping Constructs: Using for loops to iterate through command-line arguments
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // 8. String Concatenation: Joining multiple strings with a delimiter (comma and space)
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            names = nameBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}