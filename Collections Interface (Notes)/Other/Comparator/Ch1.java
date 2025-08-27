import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Comparator if using custom comparator;

public class Ch1{

    //Custom Comparator using class instansiation
    /*
    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s2.length() - s1.length();
        }
    }
    */
    

    public static void main(String[] args){
         
    List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "Watermelon", "kiwi"));
        
        
        //Sorting the list using a custom comparator
        // list.sort(new MyComparator());
        
        // Using a lambda expression to sort by length in descending order
        list.sort((a,b) -> b.length() - a.length());
        
        for (String s : list) {
            System.out.println(s);
        }
    }
}