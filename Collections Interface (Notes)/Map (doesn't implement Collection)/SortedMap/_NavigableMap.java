import java.util.NavigableMap;
import java.util.TreeMap;


class _NavigableMap{

    public static void main(String[] args) {
        
        NavigableMap<Integer, String> list = new TreeMap<>();
        
        list.put(1, "One");
        list.put(5, "Five");
        list.put(3, "Three");

        System.out.println(list);

        //Some additional Methods compared to SortedMap

        System.out.println(list.lowerKey(4)); // return key less than the given key, null if no key present
        System.out.println(list.higherKey(5)); // returns key greater than the given key, null if no key found


    }
}