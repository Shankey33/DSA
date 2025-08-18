import java.util.ArrayList;
import java.util.Vector;

class _Vector{

    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>(5, 3);
        

        list.capacity(); // Here, the initial capacity is 5 and the increment is 3, for every new element added beyond the initial capacity, the vector will increase its size by 3.

        // all methods of Vector collection are
        //list.add(1);
        //list.remove(1);
        //list.get(0);
        //list.size();
        //list.isEmpty();
        //list.clear();
        //list.contains(1);
        //list.indexOf(1);
        //list.lastIndexOf(1);
        //list.toArray();
        //list.set(0, 2);
        //list.addElement(3);
        //list.removeElement(3);

        //Thread saftey demonstration


        //Case 1: Using ArrayList that is not thread-safe

        ArrayList<Integer> arrayList = new ArrayList<>();

        Thread t1 = new Thread (() -> {
            for(int i = 0; i < 1000; i++){
                arrayList.add(i);
            }
        });

        Thread t2 = new Thread (() -> {
            for(int i = 0; i < 1000; i++){
                arrayList.add(i);
            }
        });

        t1.start();
        t2.start();

        // Wait for t1 and t2 to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Here, expected output is 2000, but due to synchronization absence, the actual output may vary every time.
        System.out.println(arrayList.size());


        //Case 2: Using Vector that is thread-safe
        
        Vector<Integer> vector = new Vector<>(); //defualt capacity is 10, will get doubled when it exceeds


        Thread t3 = new Thread (() ->{
            for(int i = 0; i < 1000; i++){
                vector.add(i);
            }
        });

        Thread t4 = new Thread (() ->{
            for(int i = 0; i < 1000; i++){
                vector.add(i);
            }
        });

        t3.start();
        t4.start();

        // Wait for t3 and t4 to finish
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Here, expected output is 2000, and due to synchronization, the actual output will always be 2000.
        System.out.println(vector.size());

    }
    
}



