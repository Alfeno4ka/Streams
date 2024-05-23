import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveIntList = new ArrayList<>();
        for (Integer i : intList) {
            if (i > 0) {
                positiveIntList.add(i);
            }
        }
        List<Integer> evenIntList = new ArrayList<>();
        for (Integer i : positiveIntList) {
            if (i%2 == 0) {
                evenIntList.add(i);
            }
        }
        Collections.sort(evenIntList);
        System.out.println(evenIntList);
    }
}
