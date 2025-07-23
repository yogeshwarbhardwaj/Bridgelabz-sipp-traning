import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyMap = countFrequencies(list);

        System.out.println(frequencyMap);
    }

    public static Map<String, Integer> countFrequencies(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : list) {
            // If element already exists, increment count; otherwise, initialize to 1
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}