public class HelloApp{
    public static void main(String[] args){
        // Accessing the first argument from the command line

        String name = "akshaya";
        name=args[0];

        System.out.println("Hello, " + name + "!");
    }
}