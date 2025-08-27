import java.util.LinkedList;


class Ch1{
    
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        list.add("Aadi");
        list.add("John");
        list.add("Rex");

        System.out.println("Initial LinkedList: " + list);

        list.remove("Rex");
        System.out.println("LinkedList after removing 'Rex': " + list);

        list.addFirst("Zara");
        System.out.println("LinkedList after adding 'Zara' at the beginning: " + list);

        list.addLast("Mia");
        System.out.println("LinkedList after adding 'Mia' at the end: " + list);

        list.set(2, "Alex");
        System.out.println("LinkedList after setting index 2 to 'Alex': " + list);

    }
}