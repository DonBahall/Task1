import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("efusef #odvs #rfvdf #e");
        array.add("#e #e");
        System.out.println(findTop5(countUsages(array)));

    }

    public static Map<String, Integer> countUsages(ArrayList<String> array) {
        Map<String, Integer> countUsages = new HashMap<>();
        if(array != null ) {
            for (String s : array) {
                String[] split = s.split(" ");
                List<String> distinct = removeDuplicates(split);
                for (String value : distinct) {
                    if (value.startsWith("#")) {
                        if (!countUsages.containsKey(value)) {
                            countUsages.put(value, 1);
                        } else {
                            countUsages.put(value, countUsages.get(value) + 1);
                        }
                    }
                }
            }
        }else return null;
        return countUsages;
    }

    private static Map<String, Integer> findTop5(Map<String, Integer> countTop5) {
        countTop5 = countTop5.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        return countTop5;
    }

    public static List<String> removeDuplicates(String[] arr) {
        return Arrays.stream(arr).distinct().toList();
    }
}
