import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task1Test {
    @Test
    public void test1() {
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(5);
        test1.add(2);
        test1.add(1);
        assertEquals(Task1.sort(new int[]{1, 5, -3, 2}), test1);
    }

    @Test
    public void test2() {
        assertNull(Task1.sort(null));
    }

    @Test
    public void test3() {
        ArrayList<Integer> nullArray = new ArrayList<>();
        assertEquals(Task1.sort(new int[]{-2, -3, -4}), nullArray);
    }
}
