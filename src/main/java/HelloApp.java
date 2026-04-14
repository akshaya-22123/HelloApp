public class HelloApp {

    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Iterate through each name provided in args
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Print the final formatted string
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}