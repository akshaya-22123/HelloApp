public class HelloApp {
    public static void main(String[] args) {
        // 1. Default name fallback
        String name = "World";

        // 2. Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the first provided argument
        }

        // 3. Output the greeting
        System.out.println("Hello, " + name + "!");
    }
}