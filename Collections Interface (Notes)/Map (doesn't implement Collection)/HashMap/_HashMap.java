import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class _HashMap {

    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Aadi");
        students.put(2, "John Doe");
        students.put(3, "Shane Doe");

        // Retrieve and print the value associated with key 
        String name1 = students.get(1);

        System.out.println("Value for key 1: " + name1);


        System.out.println(students.containsKey(4));
        System.out.println(students.containsValue("Aadi"));

        //Iteration through the hashMap
        for(int key: students.keySet()){
            System.out.print(students.get(key) + " ");
        }
        System.out.println();

        //Some advance iteration concept
        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        
        for(Map.Entry<Integer, String> entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(students);


        //In dept working of HashMap

        HashMap<String, Integer> fruitMap = new HashMap<>();

        // Process
        
        // Add using .put(key, value) 
        fruitMap.put("Apple", 50);
        
        // Hashcode is generated for the key = "Apple", suppose hashcode is 1234
        // index is calculated using hashcode % capacity (let's say capacity is 16(default for HashMap))
        // this {key = "Apple", value = 50} is stored in the bucket at index 1234 % 16 = 10

        fruitMap.put("Banana", 30);
        //same steps goes for it
        //hashcode for "Banana" is calculated, let's say it is 13942245 % 16 = 11

        fruitMap.put("Orange", 80);
        //hashcode for "Orange" is calculated, let's say it is 13942245 % 16 = 12

        fruitMap.put("Grapes", 20);
        //hashcode for "Grapes" is calculated, let's say it is 13942245 % 16 = 12

        // Collision occurs here as both "Orange" and "Grapes" map to the same index (12)

        //Now, HashMap handles the collision by using a linked list or tree structure at that index depending on the number of elements that have collided. if greater than 8 elements, it will convert to a tree structure for better performance.

        //So, at 12th index, there would be a two nodes, one for "Orange" and one for "Grapes", since orange is added first, it will be stored first, and would have a pointer to the next node which is "Grapes".
















    }

}