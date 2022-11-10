import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(sort(new int[]{1, 7, -4, 3, -8}));
    }

    public static ArrayList<Integer> sort(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<>();
        if (array != null) {
            for (int j : array) {
                if (j >= 0) {
                    newArray.add(j);
                }
            }
            newArray.sort(Collections.reverseOrder());
        } else return null;
        return newArray;
    }
}
