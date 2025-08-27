import java.util.SortedMap;
import java.util.TreeMap;


public class _TreeMap{

    public static void main(String[] args){
        
        SortedMap<String, Integer> list = new TreeMap<>();
        list.put("apple", 1);
        list.put("banana", 2);
        list.put("cherry", 3);

        System.out.println("Original SortedMap: " + list);


        // To print in descending order, we will use comparator through lambda expression

        SortedMap<String, Integer> desList = new TreeMap<>((a, b) -> b.compareTo(a));
        
        desList.put("apple", 1);
        desList.put("banana", 2);
        desList.put("cherry", 3);

        System.out.println("SortedMap in descending order: " + desList);

        //Some methods
        System.out.println(list.firstKey()); // returns the first key in the map
        System.out.println(list.lastKey()); // returns the last key in the map
        System.out.println(list.headMap("banana")); // returns a view of the portion of this map whose keys are less than the specified key
        System.out.println(list.tailMap("banana")); // returns a view of the portion of this map whose keys are greater than or equal to the specified key
        System.out.println(list.subMap("apple", "cherry")); // returns a view of the portion of this map whose keys range from the first key (inclusive) to the second key (exclusive)

    }



}