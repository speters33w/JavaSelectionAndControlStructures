public class TryCatch {
    public static void main(String[] args) throws java.lang.NumberFormatException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        try {
            System.out.println("Enter anything. " +
                               "Integers pass, " +
                               "anything else fails." +
                               "\n\"throw\" throws an exception, and " +
                               "\"exit\" terminates the program on fail.");
            int number = Integer.parseInt(scanner.nextLine());
            // Print a "pass" message to the console.
            System.out.printf("Pass! number = %d%n", number);
        } catch (NumberFormatException nfe) {
            // Print a "fail" message to the console.
            System.out.printf("Fail! \u001B[31m%s\u001B[0m%n", nfe);
            String exitOrThrow = nfe.toString()
                    .substring(nfe.toString().length() - 6);
            if(exitOrThrow
                    .equalsIgnoreCase("\"exit\"")) {  // user entered "exit".
                System.exit(1);
            } else if(exitOrThrow
                    .equalsIgnoreCase("throw\"")) {  // user entered "throw".
                throw new java.lang.NumberFormatException(nfe.toString());
            }
        } finally {
            System.out.println("Thank you for using the Java Try-Catch system. Goodbye!");
            scanner.close(); // <- The finally block is a good place to do this.
        }

        System.out.println("The program can continue after this.");
    }
}
