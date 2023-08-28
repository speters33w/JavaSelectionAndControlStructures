public class EnhancedSwitchStatement {
// requires Java 14 or above

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(6);
        System.out.printf("%nTest number: %d%n", number);

        switch (number) {
            case 1 -> System.out.print("One");
            case 2 -> System.out.print("Two");
            case 3 -> System.out.print("Three");
            case 4 -> System.out.print("Four");
            default -> System.out.print("Number is not between 1 and 4");  // if random number is 0 or 5
        }

        System.out.printf("%nThe conditional is complete.%n");
    }
}
