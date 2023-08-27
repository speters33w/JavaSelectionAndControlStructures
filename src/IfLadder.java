public class IfLadder {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(3);
        System.out.printf("%nTest number: %d%n", number);

        // 0 is false
        // 1 is true
        // 2 is neither true nor false

        if (number == 0) {
            System.out.print(false);
        } else if (number == 1) {
            System.out.print(true);
        } else {
            System.out.print("Neither true nor false");
        }

        System.out.printf("%n%nThe program will continue after this.%n");
    }
}
