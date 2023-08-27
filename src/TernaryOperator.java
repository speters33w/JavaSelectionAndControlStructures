public class TernaryOperator {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(2);
        System.out.printf("%nTest number: %d%n", number);

        // 0 is false
        // 1 is true

        System.out.println(number == 1 ? true : false);

    }
}
