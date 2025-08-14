import java.util.ArrayList;

 class Test {
    
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add("Shankey");
        list.add("Dwivedi");
        list.add("Aadi");
        for(String name: list){
            System.out.println(name);
        }

        // Inserting an element at a specific index
        list.sort(null); // Sorts the list in natural order, that is ascending order
        System.out.println("After sorting:");
        for(String name: list){
            System.out.println(name);
        }

        // Removing an element
        list.remove("Dwivedi"); 
        System.out.println("After removal:");
        for(String name: list){
            System.out.println(name);
        }

       

    }

}
