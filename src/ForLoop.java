public class ForLoop {

    /**
     * The for statement begins by declaring a counter variable, (int i = 0;,
     *     this command is run only the first time in the loop.
     * Then a condition is declared that will determine if the loop runs again, i < 4;
     *     if this condition is true after incrementing, the loop begins again.
     * Then a final command is declared that increments the counter after the loop is run, i++)
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.printf("%nStart of loop...%n");
            System.out.printf("i = %d", i);
            System.out.printf("%nEnd of loop...%n");
        }

        System.out.printf("%nThe conditional is complete.%n");
    }
}
