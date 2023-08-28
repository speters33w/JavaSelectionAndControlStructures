import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        list.forEach(System.out::println);

        System.out.printf("%nThe conditional is complete.%n");
    }
}
