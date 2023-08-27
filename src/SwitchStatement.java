public class SwitchStatement {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(6);
        System.out.printf("%nTest number: %d%n", number);

        switch (number) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            default:
                // if random number is 0 or 5
                System.out.print("Number is not between 1 and 4");
                break;
        }

        System.out.printf("%n%nThe program will continue after this.%n");
    }
}
