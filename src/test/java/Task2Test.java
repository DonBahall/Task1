import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task2Test {
    @Test
    public void test1() {
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("#hello this is #test");
        test1.add("to see how much #we have #we #hello");
        Map<String, Integer> top5 = new HashMap<>();
        top5.put("#hello", 2);
        top5.put("#test", 1);
        top5.put("#we", 1);
        assertEquals(Task2.countUsages(test1), top5);
    }

    @Test
    public void NullTest() {
        assertNull(Task2.countUsages(null));
    }
}
