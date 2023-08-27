public class DoWhileLoop {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        // Loop will run once regardless of this value,
        // unless a break, continue, or return statement is encountered.
        int number = 2112;

        // 0 breaks and jumps out of loop
        // 1 jumps to beginning of loop with continue
        // 2 does nothing, program will loop normally
        // 3 makes the condition false

        do {
            System.out.printf("%nStart of loop...%n");
            number = random.nextInt(4);
            if (number == 0) {
                System.out.printf("%nTest number: %d; break%n", number);
                break;
            } else if (number == 1) {
                System.out.printf("%nTest number: %d; continue%n", number);
                continue;
            } else if (number >= 3) {
                System.out.printf("%nTest number: %d; while condition is false%n", number);
            } else {
                System.out.printf("%nTest number: %d; while condition is true%n", number);
            }
            System.out.printf("%nEnd of loop...%n");
        } while (number < 3);

        System.out.printf("%nThe program will continue after this.%n");
    }
}
