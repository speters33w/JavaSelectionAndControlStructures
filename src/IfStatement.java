public class IfStatement {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(2);
        System.out.printf("%nTest number: %d%n", number);

        // 0 is false
        // 1 is true

        if (number == 1) {
            System.out.print(true);
        }

        System.out.printf("%n%nThe conditional is complete.%n");
    }
}
